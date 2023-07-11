package com.example.cliente_micro_contactos.dto.getAll;

import com.example.cliente_micro_contactos.dto.PersonaDTO;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
public class GetAllContactsResponseDTO implements Serializable {

    private String message;

    private List<PersonaDTO> contacts;
}
