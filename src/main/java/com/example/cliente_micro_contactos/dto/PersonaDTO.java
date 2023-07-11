package com.example.cliente_micro_contactos.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class PersonaDTO {

    @NotNull
    @Positive
    private Long idContacto;

    @Positive(message = "La edad debe ser mayor que cero")
    private int edad;

    @NotEmpty(message = "El email no debe ser vacio")
    private String email;

    @NotEmpty(message = "El nombre no debe ser vacio")
    private String nombre;


}
