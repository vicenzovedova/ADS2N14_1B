package com.senac.banco.model;

public class Investimento extends Conta{
	
	private int dataCriacao;
	
	
	public void SetData(int data)
	{
this.dataCriacao = data;


	}

	public void dividas(double taxa)
	{
		double valor = getSaldo()+(getSaldo()*taxa);

		setSaldo(valor);
	}

	public int getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(int dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
