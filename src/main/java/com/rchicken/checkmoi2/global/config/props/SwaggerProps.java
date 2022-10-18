package com.rchicken.checkmoi2.global.config.props;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.servers.Server;
@ConstructorBinding
@ConfigurationProperties(prefix = "swagger")
public record SwaggerProps(
    String title,
    String description,
    String version,
    List<SwaggerServer> servers,
    ExternalDocumentation externalDocs
){
    public  List<Server> getServers(){
        return servers.stream()
            .map(SwaggerServer::toServer)
            .toList();
    }
}
