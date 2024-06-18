package com.example.hexagonal.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
public class Task {

    private Long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private boolean completed;

}