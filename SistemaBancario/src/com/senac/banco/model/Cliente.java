package com.senac.banco.model;

public class Cliente {
	
	 String nome;
	 int tipoConta;
	 
	public Cliente (){

	}
	 

	public Cliente (String nome, int tipoConta)
	{
			this.nome = nome;
			this.tipoConta = tipoConta;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getTipoConta() {
		return tipoConta;
	}


	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	
	
	

}
