package exercicio04flamingo;

//Elaborar um programa que efetue a apresentação do valor da conversão em dólar 
//de um valor lido em real. O programa deve solicitar o valor da cotação do dólar 
//e também a quantidade de reais disponível com o usuário, para que seja apresentado 
//o valor em moeda americana.

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Valor Em Real(R$) Para Converter Para Dolar($): ");
		float real = sc.nextFloat();
		System.out.println("Digite O Valor Da Cotação Do Real($) Em Dolar(R$): ");
		float cotacao = sc.nextFloat();
		float conversao = real * cotacao;
		System.out.println("R$"+real +" = $" +conversao);
		sc.close();
	}
}
