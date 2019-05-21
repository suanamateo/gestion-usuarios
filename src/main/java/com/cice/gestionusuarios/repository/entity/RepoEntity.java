package com.cice.gestionusuarios.repository.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "repository")
public class RepoEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String uri;

    @ManyToMany(mappedBy = "repositories")
    @JsonBackReference
    private List<UsuarioEntity> usuarios;

}
