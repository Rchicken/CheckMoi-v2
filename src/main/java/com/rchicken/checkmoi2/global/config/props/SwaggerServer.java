package com.rchicken.checkmoi2.global.config.props;

import io.swagger.v3.oas.models.servers.Server;

public record SwaggerServer (
    String url,
    String description
){

    public Server toServer(){
        return new Server().url(url).description(description);
    }
}
