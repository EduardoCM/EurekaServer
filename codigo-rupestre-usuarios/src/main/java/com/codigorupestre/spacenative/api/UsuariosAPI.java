package com.codigorupestre.spacenative.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigorupestre.spacenative.model.Usuario;
import com.codigorupestre.spacenative.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuariosAPI {

	@Autowired
	private UsuarioRepository repository;
	
	@PostMapping
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
	
	@GetMapping
	public List<Usuario> obtenerUsuario(){
		return repository.findAll();
	}

}
