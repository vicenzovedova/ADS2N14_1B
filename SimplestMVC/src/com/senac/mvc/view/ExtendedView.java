package com.senac.mvc.view;

import static java.lang.System.out;

public class ExtendedView extends ContatoView {

	public void printContato(String nome, String celular, String residencial, String trabalho, String endereço)
	{
		out.println("Nome: " + nome);
		out.println("Telefone Celular: " + celular);
		out.println("Telefone Residencial: " + residencial);
		out.println("Telefone Trabalho: " + trabalho);
		out.println("Endereço: " + endereço);
		out.println("-------------------------------------------");
	}
	
}
