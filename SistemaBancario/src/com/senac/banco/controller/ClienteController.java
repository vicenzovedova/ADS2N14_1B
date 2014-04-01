package com.senac.banco.controller;
import com.senac.banco.model.*;
import com.senac.banco.view.ClienteView;

import java.util.*;

public class ClienteController {
	Scanner teclado = new Scanner(System.in);
	private Conta conta1 = new Conta();
	private Cliente cliente1 = new Cliente();
	private Especial clienteEspecial = new Especial();
	ClienteView view = new ClienteView();

	public void criaConta(){

		cliente1 = new Cliente();
		//chama a view novo cliente 
		view.novoCliente();
		cliente1.setNome(teclado.next());
		cliente1.setTipoConta(teclado.nextInt());
				
		conta1 = new Conta();
		//chama a view novo cliente verifica
		view.novoClienteVerifica();
		conta1.setNunVerificacao(teclado.nextInt());
		conta1.setNunConta(teclado.nextInt());

		//chama a view operacao concluida
		view.operacaoConcluida();
	}

	public void saque(){

		System.out.println("Digite o valor para saque: ");
		if(cliente1.getTipoConta() == 1){
			conta1.sacar(teclado.nextDouble());
			System.out.println("Operaçao concluida!");
		}else
		{

			System.out.println("Saldo insuficiente!");
		}

		if(	 cliente1.getTipoConta() == 2)
		{
			clienteEspecial.sacar(teclado.nextDouble());

		}else
		{
			System.out.println("saldo insuficiente!");
		}

	} 












}
