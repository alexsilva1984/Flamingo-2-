//Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um valor positivo,
//ou seja, o programa deverá apresentar o módulo de um número fornecido. 
//Lembre-se de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.

package exercicio06flamingo;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite Um Número: ");
		int numeroPositivo = sc.nextInt();
		if (numeroPositivo > 0) {
			System.out.println("O Valor Positivo É: " + numeroPositivo);
		} else {
			System.out.println("O Valor Positivo É: " + (numeroPositivo * -1));
		}
		sc.close();
	}
}
