package exercicio04flamingo;

//Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente
//como resultado final à soma dos quadrados dos três valores lidos.
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite O Valor A: ");
		float ValorA = sc.nextFloat();
		System.out.println("Digite O Valor B: ");
		float ValorB = sc.nextFloat();
		System.out.println("Digite O Valor C: ");
		float ValorC = sc.nextFloat();
		float Soma = (ValorA*ValorA)+(ValorB*ValorB)+(ValorC*ValorC);
		System.out.println("A Soma Dos Quadrados É: " +Soma);
		sc.close();
 }
}

