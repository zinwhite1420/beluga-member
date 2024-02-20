package com.beluga.bember.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(new Info()
            .title("Beluga Member API")
            .description("회원 관리 API")
            .version("1.0.0"));
    }
}