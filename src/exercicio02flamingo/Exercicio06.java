//Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a
//divisão dos valores.

package exercicio02flamingo;

import java.util.Scanner;

 public class Exercicio06 {

	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base");
		int base=sc.nextInt();
		System.out.println("Digite a altura");
		int altura=sc.nextInt();
		int retangulo=base*altura;
		System.out.println("O valor do retangulo é: " +retangulo);
		sc.close();
	 }
 }
 