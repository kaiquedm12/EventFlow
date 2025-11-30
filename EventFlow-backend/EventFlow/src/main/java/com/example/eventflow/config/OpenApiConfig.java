package com.example.eventflow.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI eventFlowApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("EventFlow API")
                        .description("API de gestão de eventos e ingressos")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Equipe EventFlow")
                                .email("contato@eventflow.com")
                        )
                );
    }
}
