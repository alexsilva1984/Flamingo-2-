//Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a 
//multiplicação dos valores.

package exercicio02flamingo;

import java.util.Scanner;

 public class Exercicio05 {

	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero=sc.nextInt();
		System.out.println("Digite outro numero");
		int numero1=sc.nextInt();
		int multiplicacao=numero*numero1;
		System.out.println("O valor da multiplicação é: " +multiplicacao);
		sc.close();
	 }
 }
 