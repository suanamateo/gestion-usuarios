package com.cice.gestionusuarios.repository.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "usuario")

public class UsuarioEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String user;
    private String pass;

    @OneToOne
    @JoinColumn(name = "usuario_data_id")  //one to one
    private UsuarioDataEntity userDataParam;

    @OneToMany
    @JoinColumn(name = "user_role_id")
    private List<RoleEntity> role;

    @ManyToMany
    @JoinTable(name = "repository_usuario",
         joinColumns = @JoinColumn(name = "repository_id", referencedColumnName = "id"),
         inverseJoinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id")

    )

    @JsonManagedReference
    private List<RepoEntity> repositories;

}
