package com.example.exam.controller;

import com.example.exam.dto.CreatePetResponse;
import com.example.exam.dto.PetRequest;
import com.example.exam.dto.PetResponse;
import com.example.exam.service.PetService;
//import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pet")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/{petId}")
    public ResponseEntity<PetResponse> getPetById(@PathVariable Long petId) {
        return ResponseEntity.ok(petService.getPetById(petId));
    }

    @PostMapping
    public ResponseEntity<CreatePetResponse> createPet(@RequestBody PetRequest request) {
        return ResponseEntity.ok(petService.createPet(request));
    }
}
