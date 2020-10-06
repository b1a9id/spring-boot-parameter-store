package com.b1a9idps.parameterstore.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import com.b1a9idps.parameterstore.service.SampleService;

@Component
public class SampleHandler {

    private final SampleService sampleService;

    public SampleHandler(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    public ServerResponse handleList(ServerRequest request) {
        return ServerResponse.ok().body(sampleService.list());
    }
}
