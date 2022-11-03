package exercicio09flamingo;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		int contadora = 1;
		double resultado = 0;
		Scanner sc = new Scanner(System.in);
		while (contadora <= 15) {
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			int contadoraFatorial = 1;
			double fatorial = 1;
			contadora++;
			do {
				fatorial = fatorial * contadoraFatorial;
				contadoraFatorial++;
			} while (contadoraFatorial <= numero);
			resultado = resultado+fatorial;
		}
		System.out.println("somatorio é: "+resultado);
		sc.close();

	}
}