package com.stub.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stub.project.dto.UsuarioDTO;
import com.stub.project.entity.Usuario;
import com.stub.project.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<UsuarioDTO> listarTodos() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios.stream().map(UsuarioDTO::new).toList();

	}

	public void inserir(UsuarioDTO usuarioDto) {
		Usuario usuario = new Usuario(usuarioDto);
		usuarioRepository.save(usuario);
	}

	public UsuarioDTO altererar(UsuarioDTO usuarioDto) {
		Usuario usuario = new Usuario(usuarioDto);
		return new UsuarioDTO(usuarioRepository.save(usuario));

	}

	public void excluir(Integer id) {
		Usuario usuario = usuarioRepository.findById(id).get();
		usuarioRepository.delete(usuario);

	}

	public UsuarioDTO buscarPorId(Integer id) {
		return new UsuarioDTO(usuarioRepository.findById(id).get());

	}
}
