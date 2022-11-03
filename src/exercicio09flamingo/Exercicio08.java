package exercicio09flamingo;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		String comodo;
		float soma;
		float totalSoma = 0;
		char continua;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Comodo: ");
			comodo = sc.next();
			System.out.println("Largura do Cômodo: ");
			float larguraComodo = sc.nextFloat();
			System.out.println("Comprimento do Cômodo: ");
			float comprimentoComodo = sc.nextFloat();
			soma = larguraComodo * comprimentoComodo;
			totalSoma = soma + totalSoma;
			System.out.println("Area: " + comodo + "\nLargura do Cômodo: " + larguraComodo + "\nComprimento do Cômodo: "+ comprimentoComodo);
			System.out.println("Aréa do Comodo: " + soma);
			System.out.println("Deseja adicionar mais um Cômodo? (s/n)");
			continua = sc.next().charAt(0);
			System.out.println("Valor Total Da Área Residencial: " + totalSoma);
			sc.close();
		} while (continua == 's');
	}
}
