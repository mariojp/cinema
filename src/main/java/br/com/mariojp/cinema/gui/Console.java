package br.com.mariojp.cinema.gui;

import java.util.Scanner;

import br.com.mariojp.cinema.model.Assento;
import br.com.mariojp.cinema.model.Fila;
import br.com.mariojp.cinema.model.Sala;
import br.com.mariojp.cinema.regras.SalaRegras;

public class Console {
	
	private SalaRegras regras = new SalaRegras();
	
	private Scanner teclado = new Scanner(System.in);

	
	

	public Console() {
		super();
		init();
		menu();
		
	}



	public void init() {
		System.out.print("Numero de Filas: ");
		int fileiras = Integer.parseInt(teclado.nextLine());

		System.out.print("Assentos por Filas:");
		int assentosPorFileira = Integer.parseInt(teclado.nextLine());
		regras.criaSala(fileiras, assentosPorFileira);

		
	}


	public void menu() {
		
		String op = "";
		while (!op.equals("S")) {
			imprimeSala(regras.getSala());
			System.out.println("MENU");
			System.out.println("1 VENDA");
			System.out.println("2 ESTATISTICAS");
			System.out.println("S SAIR");
			op = teclado.nextLine();
			switch (op) {
			case "1":
				System.out.print("Numero da Filas: ");
				int fila = Integer.parseInt(teclado.nextLine());
				System.out.print("Assentos:");
				int assento = Integer.parseInt(teclado.nextLine());
				regras.vendaAssento(fila, assento);
				break;
			case "2":
				System.out.println("ESTATISTICAS: ");
				System.out.printf("Total ingressos vendidos %d \n", regras.ingressosVendidos());
				System.out.printf("Percentual ingressos vendidos %.2f \n", regras.percentualIngressosVendidos());
				System.out.printf("Renda atual %.2f \n", regras.valorIngressosVendidos());
				System.out.printf("Receita total %.2f \n", regras.valorTotalIngressos());
				break;
			default:
				break;
			}

		}

		teclado.close();
	}
	

	
	
	public void imprimeSala(Sala sala) {
		System.out.println("Sala :");
		String filas = " ";
		for (int i = 1; i <= sala.getFilas().get(0).getAssentos().size(); i++)
			filas = filas + " " + i;
		System.out.println(filas);
		for (Fila fila : sala.getFilas()) {
			System.out.print(fila.getNumero()+ " ");
			for (Assento assento : fila.getAssentos()) {
				System.out.print(assento + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
