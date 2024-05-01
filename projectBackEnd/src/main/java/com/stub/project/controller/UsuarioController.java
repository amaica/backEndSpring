package com.stub.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stub.project.dto.UsuarioDTO;
import com.stub.project.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public List<UsuarioDTO> listarTodos() {
		return usuarioService.listarTodos();
	}

	@PostMapping
	public void inserir(@RequestBody UsuarioDTO usuarioDTO) {
		usuarioService.inserir(usuarioDTO);
	}

	@PutMapping
	public UsuarioDTO alterar(@RequestBody UsuarioDTO usuarioDTO) {
		return usuarioService.altererar(usuarioDTO);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable Integer id) {
		usuarioService.excluir(id);
		return ResponseEntity.ok().build();

	}

}
