package com.yosr.vetement.service;

import com.yosr.vetement.dto.APIResponseDto;
import com.yosr.vetement.dto.GenreDto;
import com.yosr.vetement.dto.VetementDto;
import com.yosr.vetement.entities.Vetement;
import com.yosr.vetement.repos.VetementRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class VetementServiceImpl implements VetementService {

    private VetementRepository vetementRepository;

    //private WebClient webClient;
    private APIClient apiClient;

    @Override
    public  APIResponseDto getVetementById(Long id) {

        Vetement vet = vetementRepository.findById(id).get();

        /*GenreDto genreDto = webClient.get()
                .uri("http://localhost:9090/api/genres/" + vet.getGenCode())
                .retrieve()
                .bodyToMono(GenreDto.class)
                .block();*/
        GenreDto genreDto = apiClient.getGenByCode(vet.getGenCode());

        VetementDto  vetementDto = new VetementDto(
                vet.getId(),
                vet.getVetName(),
                vet.getVetSize(),
                vet.getGenCode(),
                genreDto.getGenName()

        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setVetementDto(vetementDto);
        apiResponseDto.setGenreDto(genreDto);
        return apiResponseDto ;
    }
}
