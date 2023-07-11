package com.example.cliente_micro_contactos.dto.Responses;

import com.example.cliente_micro_contactos.dto.PersonaDTO;
import lombok.Data;

import java.io.Serializable;

@Data
public class GetOneContactResponseDTO implements Serializable {

    private String message;
    private PersonaDTO contact;
}
