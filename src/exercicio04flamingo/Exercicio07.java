//  Elaborar um programa que efetue a leitura de três valores (A, B e C) e 
//apresente como resultado final o quadrado da soma dos três valores lidos.

package exercicio04flamingo;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite O Valor A: ");
		float ValorA = sc.nextFloat();
		System.out.println("Digite o Valor B: ");
		float ValorB = sc.nextFloat();
		System.out.println("Digite O Valor C: ");
		float ValorC = sc.nextFloat();
		float Soma_Do_Quadrado = (ValorA + ValorB + ValorC) * (ValorA + ValorB + ValorC);
		System.out.println("Resultado Da Soma É: " + Soma_Do_Quadrado);
		sc.close();
	}

}
