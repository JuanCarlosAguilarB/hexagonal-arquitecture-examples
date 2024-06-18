package com.example.hexagonal.domain.ports.in;

import com.example.hexagonal.domain.models.AdditionalTaskInfo;

import java.util.Optional;

public interface RetriveAdditionalTaskInfo {
    public Optional<AdditionalTaskInfo> getAdditionalTaskInfo(Long id);
}
