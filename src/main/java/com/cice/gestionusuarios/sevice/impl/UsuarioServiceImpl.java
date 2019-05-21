package com.cice.gestionusuarios.sevice.impl;

import com.cice.gestionusuarios.controller.dto.UsuarioDTO;
import com.cice.gestionusuarios.repository.UsuarioRepository;
import com.cice.gestionusuarios.repository.entity.UsuarioEntity;
import com.cice.gestionusuarios.sevice.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UsuarioEntity buscarUsuarioByLogin(UsuarioDTO usuarioDTO) {
        return usuarioRepository.buscarUsuarioByLogin(usuarioDTO.getUser(), usuarioDTO.getPass());

    }

    @Override
    public void crearNuevoUsuario(UsuarioDTO usuarioDTO) {
        usuarioRepository.crearNuevoUsuario(usuarioDTO.getUser(), usuarioDTO.getPass());

    }
}
