//Escreva um algoritmo para ler o número total de eleitores de um município, 
//o número de votos brancos, nulos e válidos.Calcular e escrever o percentual
//que cada um representa em relação ao total de eleitores.

package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite número total de eleitores");
		int eleitores = sc.nextInt();

		System.out.println("Digite o número de votos brancos");
		float brancos = sc.nextFloat();

		System.out.println("Digite o número de votos nulos");
		float nulos = sc.nextFloat();

		System.out.println("Digite o número de votos validos");
		float validos = sc.nextFloat();

		float porcentagemvotosbrancos = (brancos / eleitores) * 100;
		System.out.println("A porcentagem de votos brancos é: " + porcentagemvotosbrancos + "%");
		sc.close();

		float porcentagemvotosnulos = (nulos / eleitores) * 100;
		System.out.println("A porcentagem de votos nulos é: " + porcentagemvotosnulos + "%");
		sc.close();

		float porcentagemvotosvalidos = (validos / eleitores) * 100;
		System.out.println("A porcentagem de votos validos é: " + porcentagemvotosvalidos + "%");
		sc.close();

	}

}
