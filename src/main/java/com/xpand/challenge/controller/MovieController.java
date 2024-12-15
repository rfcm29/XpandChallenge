package com.xpand.challenge.controller;

import com.xpand.challenge.dta.Movie;
import com.xpand.challenge.dto.MovieDTO;
import com.xpand.challenge.service.Service;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.UUID;

@RestController
public class MovieController {
    @Autowired
    private Service service;

    @GetMapping(path = "/{id}")
    public ResponseEntity<MovieDTO> getByID(@PathVariable("id")UUID id){
        MovieDTO movieDTO = service.getByID(id);
        return movieDTO == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(movieDTO);
    }
}
