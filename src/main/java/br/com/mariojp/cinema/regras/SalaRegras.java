package br.com.mariojp.cinema.regras;

import java.util.ArrayList;
import java.util.List;

import javax.naming.ldap.PagedResultsControl;

import br.com.mariojp.cinema.model.Assento;
import br.com.mariojp.cinema.model.Fila;
import br.com.mariojp.cinema.model.Sala;
import br.com.mariojp.cinema.persistencia.Memoria;

public class SalaRegras {

	private Memoria memoria = new Memoria();

	public void criaSala(int fileiras, int assentosPorFileira) {

		Sala sala = new Sala("Sala Unica");
		for (int i = 0; i < fileiras; i++) {
			Fila fila = new Fila(i + 1);
			for (int j = 0; j < assentosPorFileira; j++) {
				Assento a = new Assento(j + 1);
				double valor = preco(fileiras, assentosPorFileira, j);
				a.setValor(valor);
				fila.addAssento(a);
			}
			sala.addFila(fila);
		}
		memoria.setSala(sala);
	}

	private double preco(int fileiras, int assentosPorFileira, int fila) {
		int assentos = fileiras * assentosPorFileira;
		double valor = 0;
		if (assentos <= 60) {
			valor = 10;
		} else {
			if (fileiras / 2 < fila) {
				valor = 8;
			} else {
				valor = 10;
			}
		}

		return valor;
	}

	public Sala getSala() {
		return memoria.getSala();
	}

	public void vendaAssento(int fila, int assento) {
		Assento a = memoria.getSala().getAssento(fila - 1, assento - 1);
		a.setSituacao(true);
	}

	public int ingressosVendidos() {
		return memoria.getSala().ingressosVendidos();
	}
	
	public double valorIngressosVendidos() {
		return memoria.getSala().valorIngressosVendidos();
	}

	public double percentualIngressosVendidos() {
		int vendidos = ingressosVendidos();
		int assentos = totalAssentos();
		return  ( ((double) (vendidos * 100)) / assentos);
	}

	private int totalAssentos() {
		return memoria.getSala().totalAssentos();
	}

	public double valorTotalIngressos() {
		return memoria.getSala().valorTotalIngressos();
	}
}
