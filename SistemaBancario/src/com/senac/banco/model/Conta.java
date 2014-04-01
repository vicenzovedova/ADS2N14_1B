package com.senac.banco.model;

public class Conta {

	private double saldo=0;
	private int numConta =1;
	private int numVerificacao;
		
	public Conta()
	{
		
	}
	
	
	public void depositar(double valor)
	{
		this.saldo=this.saldo+valor;
	}
	
	public void sacar(double valor)
	{
		if(valor <= saldo)
		{
			saldo-=valor;
			System.out.println("Saque efetuado com sucesso!");
		}
		else
		{
			System.out.println("Saldo insuficiente!");
		}
		
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
}
	public double getSaldo() {
		return saldo;
	}


	public int getNumConta() {
		return numConta;
	}
	//para criar numero da conta
    public void setNunConta(int id)
    {
    	numConta=id;
    }

	public int getNumVerificacao() {
		return numVerificacao;
	}
	
	// para criar uma senha
	public void setNunVerificacao(int key)
	{
		numVerificacao = key;
	}

		
	
}
