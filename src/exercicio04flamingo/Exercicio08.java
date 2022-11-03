// Elaborar um programa de computador que efetue a leitura de quatro valores inteiros
//(variáveis A, B, C e D). Ao final o programa deve apresentar o resultado do produto
//(variável P) do primeiro com o terceiro valor, e o resultado do produto (variável P)
//do primeiro com o terceiro valor, e o resultado da soma (variável S) do segundo com 
//o quarto valor.

package exercicio04flamingo;

import java.util.Scanner;

public class Exercicio08 {

	public static void main (String[]Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite O Valor A:");
		float ValorA = sc.nextFloat();
		System.out.println("Digite O Valor B:");
		float ValorB = sc.nextFloat();
		System.out.println("Digite O Valor C:");
		float ValorC = sc.nextFloat();
		System.out.println("Digite O Valor D:");
		float ValorD = sc.nextFloat();
		float Produto = ValorA*ValorC;
		float Soma = ValorB+ValorD;
		System.out.println("Valor Da Variável P = "+Produto+ "\nValor Da Variável S = "+Soma);
		sc.close();
		
	}

}
