package com.cice.gestionusuarios.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_role")
public class RoleEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String role;


}
