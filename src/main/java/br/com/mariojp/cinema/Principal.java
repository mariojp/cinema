package br.com.mariojp.cinema;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero de Filas: ");
		int fileiras = Integer.parseInt(teclado.nextLine());

		System.out.println("Assentos por Filas:");
		int assentosPorFileira = Integer.parseInt(teclado.nextLine());
		

		System.out.print("Numero da Filas: ");
		int afila = Integer.parseInt(teclado.nextLine());

		System.out.println("Assentos:");
		int assento = Integer.parseInt(teclado.nextLine());

		String[][] cinema = new String[fileiras][assentosPorFileira];

		cinema[0][0] = " ";
		for (int i = 0; i < fileiras; i++) {
			for (int j = 0; j < assentosPorFileira; j++) {
				cinema[i][j] = "S";
			}
		}
		
		
		 cinema[afila-1][assento-1] = "B";

		System.out.println("Cinema:");
		String fila = " ";
		for( int i = 1; i <= assentosPorFileira; i++ )  fila = fila +" "+i; 
		System.out.println(fila);
		for (int i = 0; i < fileiras; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < assentosPorFileira; j++) {
				System.out.print(cinema[i][j] + " ");
			}
			System.out.println();
		}

		int assentos = fileiras * assentosPorFileira;
		int total;

		if (assentos <= 60) {
			total = assentos * 10;
		} else {
			if (fileiras % 2 == 0) {
				total = (assentos / 2) * 10 + (assentos / 2) * 8;
			} else {
				total = (fileiras / 2 * assentosPorFileira) * 10 + ((fileiras / 2 + 1) * assentosPorFileira) * 8;
			}
		}

		System.out.println("Total: ");
		System.out.println("R$" + total);
		
		
	      int valor = 0;
	      if (assentos <= 60) {
	        valor = 10;
	      } else {
	        int meio = cinema.length / 2;
	        if(afila <= meio){
	          valor = 10;
	        }else{
	          valor = 8;
	        }
	      }
	      
	      System.out.println("Ingresso: R$"+valor);

	}

}
