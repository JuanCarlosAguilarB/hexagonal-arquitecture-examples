package com.example.hexagonal.domain.ports.out;

import com.example.hexagonal.domain.models.AdditionalTaskInfo;

import java.util.Optional;

public interface AdditionalTaskInfoRepository {

    public Optional<AdditionalTaskInfo> getAdditionalTaskInfoById(Long id);

}
