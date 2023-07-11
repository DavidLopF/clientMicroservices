package com.example.cliente_micro_contactos.service;

import com.example.cliente_micro_contactos.dto.PersonaDTO;

import java.util.List;

public interface PersonaService {

    List<PersonaDTO> consultAll();

    PersonaDTO consultOne(String email);
}
