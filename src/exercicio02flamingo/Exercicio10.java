// Escreva um algoritmo para ler as dimensões de um losango 
//(diagonal maior, diagonal menor), calcular e escrever a área do losango.
//Dica a=D.d/2

package exercicio02flamingo;

import java.util.Scanner;

 public class Exercicio10 {

	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a diagonal maior");
		float diagonalmaior=sc.nextFloat();
		
		System.out.println("Digite a diagonal menor");
		float diagonalmenor=sc.nextFloat();
		
		float area=(diagonalmaior*diagonalmenor)/2;
		System.out.println("O área do quadrado corresponde a: " +area);
		sc.close();
	 }
 }
 