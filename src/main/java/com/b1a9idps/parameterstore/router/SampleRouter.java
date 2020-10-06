package com.b1a9idps.parameterstore.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import com.b1a9idps.parameterstore.handler.SampleHandler;

import static org.springframework.web.servlet.function.RouterFunctions.route;

@Configuration(proxyBeanMethods = false)
public class SampleRouter {

    @Bean
    public RouterFunction<ServerResponse> routes(SampleHandler handler) {
        return route()
                .path("/", builder -> builder
                        .GET("", handler::handleList))
                .filter((request, next) -> next.handle(request))
                .build();
    }
}
