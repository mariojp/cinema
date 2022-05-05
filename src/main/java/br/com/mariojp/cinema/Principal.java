package br.com.mariojp.cinema;

public class Principal {

	public static void main(String[] args) {
		String[][] cinema = new String[7][8];

		cinema[0][0] = " ";
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 8; j++) {
				cinema[i][j] = "S";
			}
		}

		System.out.println("Cinema:");
		System.out.println("  1 2 3 4 5 6 7 8");
		for (int i = 0; i < 7; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < 8; j++) {
				System.out.print(cinema[i][j] + " ");
			}
			System.out.println();
		}

	}

}
