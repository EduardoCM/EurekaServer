package com.codigorupestre.spacenative.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codigorupestre.spacenative.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
