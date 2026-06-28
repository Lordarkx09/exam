package com.example.exam.client;

import com.example.exam.dto.PetRequest;
import com.example.exam.dto.PetResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class PetStoreClient {

    private static final Logger log = LoggerFactory.getLogger(PetStoreClient.class);

    private final RestClient petStoreRestClient;

    public PetStoreClient(RestClient petStoreRestClient) {
        this.petStoreRestClient = petStoreRestClient;
    }

    //Creating API GET method
    public PetResponse getPetById(Long petId) {
        return petStoreRestClient.get()
                .uri("/pet/{petId}", petId)
                .retrieve()
                .body(PetResponse.class);
    }

    //Creating API POST-ADD method
    public PetResponse createPet(PetRequest request) {
        return petStoreRestClient.post()
                .uri("/pet")
                .body(request)
                .retrieve()
                .body(PetResponse.class);
    }
}
