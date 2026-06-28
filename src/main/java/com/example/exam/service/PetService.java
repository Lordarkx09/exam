package com.example.exam.service;

import com.example.exam.client.PetStoreClient;
import com.example.exam.dto.CreatePetResponse;
import com.example.exam.dto.PetRequest;
import com.example.exam.dto.PetResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class PetService {

    private static final Logger log = LoggerFactory.getLogger(PetService.class);

    private final PetStoreClient petStoreClient;

    public PetService(PetStoreClient petStoreClient) {
        this.petStoreClient = petStoreClient;
    }

    public PetResponse getPetById(Long petId) {
        PetResponse response = petStoreClient.getPetById(petId);

        log.info("Pet data received: {} ", response);

        return response;
    }

    public CreatePetResponse createPet(PetRequest request) {
        PetResponse externalResponse = petStoreClient.createPet(request);

        log.info("Pet data created: {} ", externalResponse);

        return new CreatePetResponse(
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                true,
                externalResponse.name()
        );
    }
}
