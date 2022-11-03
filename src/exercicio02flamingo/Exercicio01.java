// Escreva um algoritmo para ler um valor do teclado e exibir como resposta o 
//número sucessor.

/*Coment�rio Multilinha*/

/**
 * JavaDoc
*@author aluno
*/
package exercicio02flamingo;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero=sc.nextInt();
		
		int sucessor=numero+1;
		
				System.out.println("O sucessor de " +numero+ " � " +sucessor);
				sc.close();
	}
}
