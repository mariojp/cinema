package br.com.mariojp.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.mariojp.cinema.gui.Console;
import br.com.mariojp.cinema.model.Assento;

public class Principal {

	

	public static void main(String[] args) {
		
		new Console();

//		Scanner teclado = new Scanner(System.in);
//		System.out.print("Numero de Filas: ");
//		int fileiras = Integer.parseInt(teclado.nextLine());
//
//		System.out.print("Assentos por Filas:");
//		int assentosPorFileira = Integer.parseInt(teclado.nextLine());
//
//		criaSala(fileiras, assentosPorFileira);
//
//		String op = "";
//		while (!op.equals("S")) {
//			imprimeSala();
//			System.out.println("MENU");
//			System.out.println("1 VENDA");
//			System.out.println("2 ESTATISTICAS");
//			System.out.println("S SAIR");
//			op = teclado.nextLine();
//			switch (op) {
//			case "1":
//				System.out.print("Numero da Filas: ");
//				int afila = Integer.parseInt(teclado.nextLine());
//				System.out.print("Assentos:");
//				int assento = Integer.parseInt(teclado.nextLine());
//				vendaAssento(afila, assento);
//				break;
//			case "2":
//				System.out.println("ESTATISTICAS: ");
//				System.out.printf("Total ingressos vendidos %d \n", ingresos);
//				int assentos = fileiras * assentosPorFileira;
//
//				System.out.printf("Percentual ingressos vendidos %.2f \n", (double)((ingresos * 100) / assentos ) );
//				
//				System.out.printf("Renda atual %.2f \n", totalvendido);
//				System.out.printf("Receita total %.2f \n", total);
//				break;
//			default:
//				break;
//			}
//
//		}
//
//		teclado.close();
	}

}
