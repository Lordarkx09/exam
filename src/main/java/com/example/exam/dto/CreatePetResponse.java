package com.example.exam.dto;

import java.time.LocalDateTime;

public record CreatePetResponse(
        String transactionId,
        LocalDateTime dateCreated,
        boolean status,
        String name
) {
}
