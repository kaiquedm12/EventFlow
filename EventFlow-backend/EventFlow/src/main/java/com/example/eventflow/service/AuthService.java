package com.example.eventflow.service;
import com.example.eventflow.domain.model.RefreshToken;
import com.example.eventflow.domain.model.Role;
import com.example.eventflow.domain.model.User;
import com.example.eventflow.domain.repository.RefreshTokenRepository;
import com.example.eventflow.domain.repository.RoleRepository;
import com.example.eventflow.domain.repository.UserRepository;
import com.example.eventflow.dto.AuthResponse;
import com.example.eventflow.dto.LoginRequest;
import com.example.eventflow.dto.RegisterRequest;
import com.example.eventflow.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Optional;



@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepo;
    private final RoleRepository roleRepo;
    private final RefreshTokenRepository refreshRepo;
    private final JwtService jwt;
    private final PasswordEncoder encoder;

    public AuthResponse register(RegisterRequest req) {

        Role role = roleRepo.findByName("ROLE_" + req.getRole().toUpperCase())
                .orElseThrow(() -> new RuntimeException("Role inválida"));

        User u = new User();
        u.setName(req.getName());
        u.setEmail(req.getEmail());
        u.setPassword(encoder.encode(req.getPassword()));
        u.setRole(role);

        userRepo.save(u);

        return createTokens(u);
    }

    public AuthResponse login(LoginRequest req) {

        User u = userRepo.findByEmail(req.getEmail())
                .orElseThrow(() -> new RuntimeException("Email incorreto"));

        if (!encoder.matches(req.getPassword(), u.getPassword()))
            throw new RuntimeException("Senha incorreta");

        return createTokens(u);
    }

    public AuthResponse refresh(String refreshToken) {

        RefreshToken r = refreshRepo.findByToken(refreshToken)
                .orElseThrow(() -> new RuntimeException("Refresh inválido"));

        if (r.getExpiresAt().isBefore(LocalDateTime.now()))
            throw new RuntimeException("Refresh expirado");

        return createTokens(r.getUser());
    }

    private AuthResponse createTokens(User user) {

        String access = jwt.generateToken(user);
        String refresh = jwt.generateRefreshToken(user);

        RefreshToken r = new RefreshToken();
        r.setUser(user);
        r.setToken(refresh);
        r.setExpiresAt(LocalDateTime.now().plusDays(30));

        refreshRepo.save(r);

        return new AuthResponse(access, refresh);
    }
}
