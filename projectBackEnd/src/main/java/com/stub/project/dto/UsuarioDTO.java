package com.stub.project.dto;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stub.project.entity.Usuario;

import lombok.Getter;
import lombok.Setter;

public class UsuarioDTO {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private LocalDate dataCadastro;

	private String nome;

	private String senha;

	private String email;

	public UsuarioDTO(Usuario usuario) {
		BeanUtils.copyProperties(usuario, this);

	}

	public UsuarioDTO() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
