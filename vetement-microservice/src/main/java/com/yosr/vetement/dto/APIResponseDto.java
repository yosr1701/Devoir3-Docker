package com.yosr.vetement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor


public class APIResponseDto {
    private VetementDto vetementDto;
    private GenreDto genreDto;
}
