package com.cice.gestionusuarios.sevice;


import com.cice.gestionusuarios.controller.dto.UsuarioDTO;
import com.cice.gestionusuarios.repository.entity.UsuarioEntity;

public interface UsuarioService {

    /**
     * Método que buscará usuario on base a los datos obtenidos del formulario
     * de login
     *
     * @param usuarioDTO
     * @return
     */

    UsuarioEntity buscarUsuarioByLogin (UsuarioDTO usuarioDTO);

    void crearNuevoUsuario (UsuarioDTO usuarioDTO);


}
