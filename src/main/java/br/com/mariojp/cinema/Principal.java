package br.com.mariojp.cinema;

import java.util.Scanner;

public class Principal {

	private static String[][] cinema = null;
	private static int ingresos = 0;
	private static double total = 0;
	private static double totalvendido = 0;

	private static void criaSala(int fileiras, int assentosPorFileira) {
		cinema = new String[fileiras][assentosPorFileira];
		cinema[0][0] = " ";
		for (int i = 0; i < fileiras; i++) {
			for (int j = 0; j < assentosPorFileira; j++) {
				cinema[i][j] = "S";
			}
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
		String fila = " ";
		for (int i = 1; i <= cinema.length; i++)
			fila = fila + " " + i;
		System.out.println(fila);
		for (int i = 0; i < cinema.length; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < cinema[i].length; j++) {
				System.out.print(cinema[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void vendaAssento(int fila, int assento) {
		cinema[fila - 1][assento - 1] = "B";
		int assentos = cinema.length*cinema[0].length;
		int valor = 0;
		if (assentos <= 60) {
			valor = 10;
		} else {
			int meio = cinema.length / 2;
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
