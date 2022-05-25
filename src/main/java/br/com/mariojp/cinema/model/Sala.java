package br.com.mariojp.cinema.model;

import java.util.ArrayList;
import java.util.List;

public class Sala {
	
	private String nome;
	
	public Sala(String nome) {
		this.nome = nome;
	}
	
	private List<Fila> filas = new ArrayList<Fila>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Fila> getFilas() {
		return filas;
	}

	public void setFilas(List<Fila> filas) {
		this.filas = filas;
	}

	public void addFila(Fila fila) {
		this.filas.add(fila);
	}
	
	public int totalAssentos() {
		int total = 0;
		for (Fila fila : filas) {
			total += fila.totalAssentos();
		}
		return total;
	}
	
	public int totalReceita() {
		int total = 0;
		for (Fila fila : filas) {
			total += fila.totalAssentos();
		}
		return total;
	}

	public Assento getAssento(int numeroFila, int numeroAssento) {
		Fila fila = filas.get(numeroFila);
		return fila.getAssento(numeroAssento); 
	}

	public int ingressosVendidos() {
		int ingressos = 0;
		for (Fila fila : filas) {
			ingressos += fila.ingressosVendidos();
		}
		return ingressos;
	}
	
	public double valorTotalIngressos() {
		double valor = 0;
		for (Fila fila : filas) {
			valor += fila.valorTotalIngressos();
		}
		return valor;
	}

	public double valorIngressosVendidos() {
		double valor = 0;
		for (Fila fila : filas) {
			valor += fila.valorIngressosVendidos();
		}
		return valor;
	}
	
	
	

}
