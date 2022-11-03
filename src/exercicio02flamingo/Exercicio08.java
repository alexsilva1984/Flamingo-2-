//Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. 
//Dica a=b.h/2

package exercicio02flamingo;

import java.util.Scanner;

public class Exercicio08 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		float numero=sc.nextFloat();
		System.out.println("Digite outro numero");
		float numero1=sc.nextFloat();
		float divisao=numero/numero1;
		System.out.println("O valor da divisão é: " +divisao);
		sc.close();
	 }
 }