package com.b1a9idps.parameterstore.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.b1a9idps.parameterstore.dto.response.SampleResponse;
import com.b1a9idps.parameterstore.repository.SampleRepository;

@Service
public class SampleService {

    private final SampleRepository sampleRepository;

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public List<SampleResponse> list() {
        return sampleRepository.findAll().stream()
                .map(sample -> new SampleResponse(sample.getId(), sample.getName()))
                .collect(Collectors.toList());
    }
}
