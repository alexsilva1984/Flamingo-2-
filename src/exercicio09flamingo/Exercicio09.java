package exercicio09flamingo;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		int maior = 0;
		int menor = 0;
		int numero = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um Numero Positivo: ");
			numero = sc.nextInt();
			if (numero > maior) {
				maior = numero;
			} else {
				menor = numero;
			}
			sc.close();
		} while (numero >= 0);

		System.out.println("maior numero é: " + maior + "menor número é: " + menor);
	}
}
