package br.com.mariojp.cinema.model;

public class Assento {

	private int numero;
	
	private double valor;
	
	private boolean situacao;

	public Assento(int numero) {
		super();
		this.numero = numero;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return situacao?"B":"S";
	}
}
