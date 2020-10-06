package com.b1a9idps.parameterstore.dto.response;

public final class SampleResponse {
    private final int id;
    private final String name;

    public SampleResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
