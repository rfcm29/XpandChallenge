package com.xpand.challenge.configuration;

import com.xpand.challenge.service.MovieService;
import com.xpand.challenge.service.Service;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
