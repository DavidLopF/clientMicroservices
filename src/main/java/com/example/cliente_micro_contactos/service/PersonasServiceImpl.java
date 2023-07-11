package com.example.cliente_micro_contactos.service;

import com.example.cliente_micro_contactos.dto.GeneralResponseMicro;
import com.example.cliente_micro_contactos.dto.PersonaDTO;
import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Log4j2
public class PersonasServiceImpl implements PersonaService{

    @Autowired
    RestTemplate template;

    String url="http://localhost:8080/api";


    @Override
    public List<PersonaDTO> consultAll() {
        try{
            ResponseEntity<GeneralResponseMicro> response = template.exchange(url + "/getAllContacto", HttpMethod.GET, null, GeneralResponseMicro.class);
            GeneralResponseMicro responseBody = response.getBody();

            if (responseBody != null && responseBody.getObject() != null) {
                Gson gson = new Gson();
                String json = gson.toJson(responseBody.getObject());
                List<PersonaDTO> personas = List.of(gson.fromJson(json, PersonaDTO[].class));
                log.info(".............::::: Respuesta del microservicio :::::.............");
                log.info(".............:::::\n" + personas + "\n:::::.............");
                return personas;
            }
            log.info(".............::::: no hubo nada en la respuesta :::::.............");
            return null;
        }catch (Exception e) {
            log.info(".............::::: error en el servicio :::::.............");
            log.error("Error in consultAll", e);
        }
        return null;
    }
}
