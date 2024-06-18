//package com.example.hexagonal.appication.usecases;
//
//import com.example.hexagonal.domain.models.AdditionalTaskInfo;
//import com.example.hexagonal.domain.ports.in.RetriveAdditionalTaskInfo;
//import com.example.hexagonal.domain.ports.out.AdditionalTaskInfoRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class RetriveAdditionalTaskInfoUseCase implements RetriveAdditionalTaskInfo {
//
//    private final AdditionalTaskInfoRepository additionalTaskInfoRepository;
//
//    public RetriveAdditionalTaskInfoUseCase(AdditionalTaskInfoRepository additionalTaskInfoRepository) {
//        this.additionalTaskInfoRepository = additionalTaskInfoRepository;
//    }
//
//    @Override
//    public Optional<AdditionalTaskInfo> getAdditionalTaskInfo(Long id) {
//        return additionalTaskInfoRepository.getAdditionalTaskInfoById(id);
//    }
//}
