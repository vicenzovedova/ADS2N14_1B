package com.senac.banco.view;
import java.util.*;

import com.senac.banco.controller.*;
import com.senac.banco.model.*;

public class ClienteView {
	
	

	public static void main(String[] args) {
		ClienteController controle = new ClienteController();
		Scanner t = new Scanner(System.in);
		int op0=0; // entrar ou sair do sistema
		int op1=0; // cliente 
		int op2=0; // para realizar opera�ao na conta
		int op3=0; // cliente novo
        
		Cliente cliente1 = new Cliente(null, 0);
		Conta conta1 = new Conta();
		
		// AQUI devera tem uma repeti��o do sistema usando DO while ou while  TESTAr
	//	System.out.println("DIgite: \n 1- Entrar \n 2- Sair");
	//	op0=t.nextInt();
		System.out.println("DIgite: \n 1- Entrar \n 2- Sair");
		op0= t.nextInt();
		while (op0 == 1) {
			System.out.println("BEM VINDO AO SISTEMA BANCARIO XXX");
			System.out.println("Voce j� e nosso Cliente: \n 1- Sim \n 2- N�o, mas quero abrir uma conta");
			op1= t.nextInt();
		}
		while (op0 !=0){
			
		}
						
		
					
		switch(op1){
		case 1:
			// Primeira parte do switch user ja tem conta e deseja fazer opera��o
			controle.criaConta();
			
			
			
			System.out.println("Digite numero da sua conta e sua senha");
			// compara a conta e a senha se validar abre as opera��es se nao pede novamente senha
			System.out.println("Bem vindo Sr(a) \n Digite: \n 1- Sacar \n 2- Ver saldo \n 3- Depositar \n 4- SAIR");
			// realiza as opera��es conforme op�ao
			op2 = t.nextInt();
			switch(op2){
			case 1: 
				//realiza saque
				break;
			case 2: 
				// verifica saldo
				break;
			case 3:
				// realiza deposito
				break;
			case 4:
				// sai do programa
				break;
			
			}
			
			
			break;
			
			
			// segunda parte do 1� switch se cliente qer abrir uma conta
			
			
		case 2:
		/*	System.out.println("Que tipo de conta deseja abrir: ");
			// chama as aberturas de conta
			op3= t.nextInt();
			
			switch(op3){
			
			case 1:
				// cria conta comum
				*/
				controle.criaConta();
				
				//break;
		/*	case 2:
				//cria conta Especial
				
				break;
			case 3: 
				//cria conta de investimento
				
				break;
			case 4:
				// SAIR do programa
				break;*/
			}
			
	/*		break;
		default:
			System.out.println("Opera��o invalida!");
			break;*/
		//}
		}
		
		public void novoCliente(){
			System.out.println("Digite o seu nome e a conta( 1- Comum, 2- Especial e 3- Investimento):");
		}
		
		public void novoClienteVerifica(){
			System.out.println(" Escolha um numero de verifica��o para sua conta e escolha numero para sua conta:");
		}
		
		public void operacaoConcluida(){
			System.out.println("Opera�ao concluida!");
		}
	
		
}


