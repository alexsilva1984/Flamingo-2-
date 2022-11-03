package exercicio09flamingo;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		int numero = 0;
		int totalValores = 0;
		int totalSoma = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite Um Número:");
			numero = sc.nextInt();
			if (numero > 0) {
				totalSoma = totalSoma + numero;
				totalValores++;
			}
			sc.close();
		} while (numero > 0);
		float media = (totalSoma / totalValores);
		System.out.println("Total Soma: " + totalSoma + " Media: " + media + " Total Valores Lidos: " + totalValores);
	}

}

