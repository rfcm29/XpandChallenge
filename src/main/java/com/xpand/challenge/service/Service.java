package com.xpand.challenge.service;

import com.xpand.challenge.dto.MovieDTO;

import java.util.UUID;

public interface Service {
    MovieDTO getByID(UUID id);
}
