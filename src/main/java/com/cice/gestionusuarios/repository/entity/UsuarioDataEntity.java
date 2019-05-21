package com.cice.gestionusuarios.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario_data")
public class UsuarioDataEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String email;

    @OneToOne
    @JoinColumn(name = "usuario_data")
    private UsuarioDataEntity userData;

}
