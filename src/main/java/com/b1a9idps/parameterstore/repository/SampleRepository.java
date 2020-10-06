package com.b1a9idps.parameterstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.b1a9idps.parameterstore.entity.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Integer> {
}
