package com.senac.mvc.controller;

import com.senac.mvc.model.Pessoa;
import com.senac.mvc.view.ContatoView;

public class PessoaController {

	private Pessoa[] contato = new Pessoa [50];
	private String nome [] = {"João","Fábio", "Alex", "Luciano", "Sandro", "Thiago", "Mateus", "Patricio", "Pedro" };
	private String sobrenome []  = {"Silva", "Moreira", "Santos", "Tréz", "Severo", "Souza"};
	private String endereço [] = {"Dr. Flores","Republica","Lima e Silva","João Alfredo","Getulio"};
	private String celular [] = {"989-9654","964-5674","não tem","932-9421","941-2110", "965-2147"};
	private String residencial [] = {"321-9641","não tem","332-5210","310-2458","333-3641","324-5475"};
	private String trabalho [] = {"310-0441","não tem","302-4710","333-2058","321-5541","398-0075"};
	private String ddd [] = {"51","21","14","48","33"};
	
	
	int sorteio;
	int sorteio2;
	int sorteio3;
	int sorteio4;
	int sorteio5;
	int sorteio6;
	int sorteio7;

	
	public void criarContato()
	{
		for ( int i=0; i<50; i++){
			
		int sorteio = (int) (Math.random()*9);
		int sorteio2 = (int) (Math.random()*5);
		int sorteio3 = (int) (Math.random()*5);
		int sorteio4 = (int) (Math.random()*5);
		int sorteio5 = (int) (Math.random()*6);
		int sorteio6 = (int) (Math.random()*5);
		int sorteio7 = (int) (Math.random()*6);
		
					
		contato[i] = new Pessoa();
		contato[i].setNome(nome[sorteio] + " " + sobrenome[sorteio2]);
		contato[i].setCelular(ddd[sorteio6] + " " +celular[sorteio4]);
		contato[i].setResidencial(ddd[sorteio6]+ " " + residencial[sorteio5]);
		contato[i].setTrabalho(ddd[sorteio6]+ " " + trabalho[sorteio7]);
		contato [i].setEndereço(endereço[sorteio3]);
		
		}
	}
			
	public void exibirContato( ContatoView view )
	{
		for(int h=0; h<50; h++){
				
		view.printContato(contato[h].getNome(), contato[h].getCelular(), contato[h].getResidencial(), contato[h].getTrabalho(), contato[h].getEndereço());
	}
	
}
}
