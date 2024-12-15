package com.xpand.challenge.service;

import com.xpand.challenge.dta.Movie;
import com.xpand.challenge.dto.MovieDTO;
import com.xpand.challenge.repository.MovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@org.springframework.stereotype.Service
public class MovieService implements Service{
    @Autowired
    private MovieRepository repository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public MovieDTO getByID(UUID id) {

        return convertToDTO(repository.findById(id).orElse(null));
    }

    private MovieDTO convertToDTO(Movie movie){
        return movie == null ? null : mapper.map(movie, MovieDTO.class);
    }
}
