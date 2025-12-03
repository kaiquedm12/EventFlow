package com.example.eventflow.controllers;
import com.example.eventflow.dto.AuthResponse;
import com.example.eventflow.dto.LoginRequest;
import com.example.eventflow.dto.RegisterRequest;
import com.example.eventflow.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.Map;



@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService auth;

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest req) {
        return auth.register(req);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest req) {
        return auth.login(req);
    }

    @PostMapping("/refresh")
    public AuthResponse refresh(@RequestBody Map<String,String> body) {
        return auth.refresh(body.get("refreshToken"));
    }
}
