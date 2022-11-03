package exercicio04flamingo;

//Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da 
//diferença do primeiro valor pelo segundo.

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] Args) {
		int Resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Valor Da Variável A: ");
		int A = sc.nextInt();
		System.out.println("Digite O Valor DA Variável B: ");
		int B = sc.nextInt();
		Resultado = A - B;
		Resultado = Resultado * Resultado;
		System.out.println("Resultado Do Quadrado Será: "+Resultado);
		sc.close();
	}

}
