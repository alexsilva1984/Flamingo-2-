//Escreva um algoritmo para ler um valor do teclado e exibir como resposta o 
//número antecessor.

/*Coment�rio Multilinha*/

/**
 * JavaDoc
*@author Alex
*/
package exercicio02flamingo;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero=sc.nextInt();
		
		int antecessor=numero-1;
		
				System.out.println("O sucessor de " +numero+ " � " +antecessor);
				sc.close();
	}
}