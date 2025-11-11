package com.yosr.vetement.service;

import com.yosr.vetement.dto.APIResponseDto;
import com.yosr.vetement.dto.VetementDto;

public interface VetementService {

    APIResponseDto getVetementById(Long id);
}


