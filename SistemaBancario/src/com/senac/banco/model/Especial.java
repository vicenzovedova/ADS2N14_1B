package com.senac.banco.model;

public class Especial extends Conta {
	
		
	private double limite =0;
	
	
	
	public Especial()
	{
					
	}	
	
	
		public void verificaLimite(double limite)
	{
		this.limite=this.limite-limite;
	}
		
	public void saque(Double valor)
	{
		if((getSaldo () -valor<this.limite))
		{
		
		System.out.println("Saldo insuficiente");
		}
		else
		{
			System.out.println("Saque realizado com sucesso!");
		}
		double valor2 = getSaldo()-valor;
		setSaldo(valor2);
	}
	


}
