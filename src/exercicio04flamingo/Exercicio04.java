package exercicio04flamingo;

//Elaborar um programa que efetue a apresentação do valor da conversão em real 
//de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar
//e também a quantidade de dólares disponível com o usuário,para que seja apresentado
//o valor em moeda brasileira.

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Valor Em Dolar($) Para Converter Para Real(R$): ");
		float dolar = sc.nextFloat();
		System.out.println("Digite O Valor Da Cotação Do Dolar($) Em Real(R$): ");
		float cotacao = sc.nextFloat();
		float conversao = dolar * cotacao;
		System.out.println( "$" + dolar + " = " + "R$" +conversao);
		sc.close();
	}
}
