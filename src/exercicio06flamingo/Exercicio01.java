//Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.

package exercicio06flamingo;

import java.util.Scanner;

public class Exercicio01 {

			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o Primeiro Valor: ");
			int primeiroValor = sc.nextInt();
			System.out.println("Digite o Segundo Valor: ");
			int segundoValor = sc.nextInt();
			if (primeiroValor > segundoValor) {
				System.out.println("A Diferença entre os numeros é: "+(primeiroValor-segundoValor));
			}else {
				System.out.println("A Diferença entre os numeros é: "+(segundoValor-primeiroValor));
			}
			sc.close();
		}

	}
