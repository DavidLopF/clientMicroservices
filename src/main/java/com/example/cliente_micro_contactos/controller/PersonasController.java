package com.example.cliente_micro_contactos.controller;

import com.example.cliente_micro_contactos.dto.PersonaDTO;
import com.example.cliente_micro_contactos.dto.getAll.GetAllContactsResponseDTO;
import com.example.cliente_micro_contactos.service.PersonasServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class PersonasController {

    @Autowired
    PersonasServiceImpl personaService;

    @GetMapping(value = "/getPersonas", produces = "application/json")
    public ResponseEntity<GetAllContactsResponseDTO> getPersonas() {
        log.info(".............::::: Lanzando servicio Get - Recuperar personas :::::.............");
        List<PersonaDTO> personas = personaService.consultAll();
        if (personas != null) {
            GetAllContactsResponseDTO response = new GetAllContactsResponseDTO();
            response.setMessage("contactos recuperadas");
            response.setContacts(personas);
            return ResponseEntity.ok().body(response);
        }else{
            return ResponseEntity.badRequest().body(null);
        }
    }

}
