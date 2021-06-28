package com.web.UmPesoDoSucesso.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.UmPesoDoSucesso.Model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional <Usuario> findByUsuario(String usuario);

}
