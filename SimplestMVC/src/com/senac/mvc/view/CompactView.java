package com.senac.mvc.view;

import static java.lang.System.*;

public class CompactView extends ContatoView {

	@Override
	public void printContato(String nome, String celular, String residencial, String trabalho, String endereço) {
		out.println(String.format("Contato: %s - %s - %s - %s - %s", nome, celular, residencial, trabalho, endereço));
	}

}
