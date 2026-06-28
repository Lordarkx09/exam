package com.example.exam.dto;

public record PetRequest(
        Long id,
        String status,
        String name
) {
}
