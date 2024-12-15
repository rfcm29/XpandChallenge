package com.xpand.challenge.dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

public @Data class MovieDTO {
    private UUID id;
    private String title;
    private Date date;
    private int rank;
    private long revenue;
}
