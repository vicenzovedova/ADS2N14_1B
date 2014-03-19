package com.senac.mvc.model;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String endereço;
	private String celular;
	private String residencial;
	private String trabalho;
	
	
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getResidencial() {
	return residencial;
	}
	public void setResidencial(String residencial) {
		this.residencial = residencial;
	}
	
	public String getTrabalho() {
		return trabalho;
		}
		public void setTrabalho(String trabalho) {
			this.trabalho = trabalho;
		}
}
