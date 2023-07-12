package com.example.cliente_micro_contactos.service;

import com.example.cliente_micro_contactos.dto.PersonaDTO;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface PersonaService {

    CompletableFuture<List<PersonaDTO>> consultAll();

    CompletableFuture<PersonaDTO> consultOne(String email);
}
