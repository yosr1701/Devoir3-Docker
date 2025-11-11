package com.yosr.vetement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class VetementDto {
    private Long id;
    private String VetName;
    private String VetSize;
    private String genCode;
    private String GenreName;
}
