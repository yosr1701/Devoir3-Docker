package com.yosr.vetement.service;

import com.yosr.vetement.dto.GenreDto;
import org.springframework.stereotype.Component;

@Component
public class DeptFallBack implements APIClient{

    @Override
    public GenreDto getGenByCode(String genreCode){
        return null;
    }
}