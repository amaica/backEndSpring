package com.stub.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stub.project.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	

}
