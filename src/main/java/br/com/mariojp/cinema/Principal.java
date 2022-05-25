package br.com.mariojp.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	private static List<List<Assento>> cinema = new ArrayList<List<Assento>>();
	private static int ingresos = 0;
	private static double total = 0;
	private static double totalvendido = 0;

	private static void criaSala(int fileiras, int assentosPorFileira) {
		for (int i = 0; i < fileiras; i++) {
			List<Assento> fila = new ArrayList<Assento>();
			for (int j = 0; j < assentosPorFileira; j++) {
				Assento a = new Assento();
				
				fila.add(a);
			}
			cinema.add(fila);
		}

		int assentos = fileiras * assentosPorFileira;

		if (assentos <= 60) {
			total = assentos * 10;
		} else {
			if (fileiras % 2 == 0) {
				total = (assentos / 2) * 10 + (assentos / 2) * 8;
			} else {
				total = (fileiras / 2 * assentosPorFileira) * 10 + ((fileiras / 2 + 1) * assentosPorFileira) * 8;
			}
		}
	}

	public static void imprimeSala() {
		System.out.println("Cinema:");
		String filas = " ";
		for (int i = 1; i <= cinema.size(); i++)
			filas = filas + " " + i;
		System.out.println(filas);
		for (int i = 0; i < cinema.size(); i++) {
			System.out.print((i + 1) + " ");
			
			for (int j = 0; j < cinema.get(i).size(); j++) {
			
				System.out.print(cinema.get(i).get(j) + " ");
			
			}
			
			System.out.println();
		}
	}

	private static void vendaAssento(int fila, int assento) {
		Assento a = cinema.get(fila-1).remove(assento-1);
		a.setSituacao(true);
		cinema.get(fila-1).add(assento-1,a);
		
		int assentos = cinema.size()*cinema.get(0).size();
		int valor = 0;
		if (assentos <= 60) {
			valor = 10;
		} else {
			int meio = cinema.size() / 2;
			if (fila <= meio) {
				valor = 10;
			} else {
				valor = 8;
			}
		}
		ingresos++;
		totalvendido += valor;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero de Filas: ");
		int fileiras = Integer.parseInt(teclado.nextLine());

		System.out.print("Assentos por Filas:");
		int assentosPorFileira = Integer.parseInt(teclado.nextLine());

		criaSala(fileiras, assentosPorFileira);

		String op = "";
		while (!op.equals("S")) {
			imprimeSala();
			System.out.println("MENU");
			System.out.println("1 VENDA");
			System.out.println("2 ESTATISTICAS");
			System.out.println("S SAIR");
			op = teclado.nextLine();
			switch (op) {
			case "1":
				System.out.print("Numero da Filas: ");
				int afila = Integer.parseInt(teclado.nextLine());
				System.out.print("Assentos:");
				int assento = Integer.parseInt(teclado.nextLine());
				vendaAssento(afila, assento);
				break;
			case "2":
				System.out.println("ESTATISTICAS: ");
				System.out.printf("Total ingressos vendidos %d \n", ingresos);
				int assentos = fileiras * assentosPorFileira;

				System.out.printf("Percentual ingressos vendidos %.2f \n", (double)((ingresos * 100) / assentos ) );
				
				System.out.printf("Renda atual %.2f \n", totalvendido);
				System.out.printf("Receita total %.2f \n", total);
				break;
			default:
				break;
			}

		}

		teclado.close();
	}

}
