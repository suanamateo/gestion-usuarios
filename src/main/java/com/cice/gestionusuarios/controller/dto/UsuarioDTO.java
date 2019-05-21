package com.cice.gestionusuarios.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UsuarioDTO {

    private Long id;
    private String user;
    private String pass;

}
