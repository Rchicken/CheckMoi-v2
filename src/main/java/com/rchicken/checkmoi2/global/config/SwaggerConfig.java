package com.rchicken.checkmoi2.global.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rchicken.checkmoi2.global.config.props.SwaggerProps;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(SwaggerProps.class)
public class SwaggerConfig {
    private final SwaggerProps swaggerProps;

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
            .info(new Info().title(swaggerProps.title())
                .description(swaggerProps.description())
                .version(swaggerProps.version()))
            .servers(swaggerProps.getServers())
            .externalDocs(swaggerProps.externalDocs());
    }
}
