package com.yosr.vetement.service;

import com.yosr.vetement.dto.GenreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:9090", value = "GENRE")
@FeignClient(name = "GENRE")
public interface APIClient {

    @GetMapping("api/genres/{genre-code}")
    GenreDto getGenByCode(@PathVariable("genre-code")
                             String genreCode
    );
}
