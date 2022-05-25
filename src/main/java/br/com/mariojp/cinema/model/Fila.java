package br.com.mariojp.cinema.model;

import java.util.ArrayList;
import java.util.List;

public class Fila {
	
	private int numero;
	
	private List<Assento> assentos = new ArrayList<Assento>();

	public Fila(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Assento> getAssentos() {
		return assentos;
	}

	public void setAssentos(List<Assento> assentos) {
		this.assentos = assentos;
	}

	public void addAssento(Assento a) {
		this.assentos.add(a);
	}

	public int totalAssentos() {
		return assentos.size();
	}

	public Assento getAssento(int numeroAssento) {
		return this.assentos.get(numeroAssento);
	}

	public int ingressosVendidos() {
		int ingressos = 0;
		for (Assento assento : assentos) {
			if(assento.isSituacao()) {
				ingressos++;
			}
		}
		return ingressos;
	}

	public double valorIngressosVendidos() {
		double valor = 0;
		for (Assento assento : assentos) {
			if(assento.isSituacao()) {
				valor+= assento.getValor();
			}
		}
		return valor;
	}
	
	public double valorTotalIngressos() {
		double valor = 0;
		for (Assento assento : assentos) {
				valor+= assento.getValor();
		}
		return valor;
	}

}
