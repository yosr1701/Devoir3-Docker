package com.yosr.genre.service;

import com.yosr.genre.dto.GenreDto;
import com.yosr.genre.entities.Genre;
import com.yosr.genre.repos.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GnereService {
    @Autowired
    private GenreRepository genreRepository;

    @Override
    public GenreDto getGenreByCode(String code) {
        Genre gen = genreRepository.findByGenCode(code);

        GenreDto genreDto = new GenreDto(
                gen.getId(),
                gen.getGenName(),
                gen.getGenCode()
        );

        return genreDto;
    }
}
