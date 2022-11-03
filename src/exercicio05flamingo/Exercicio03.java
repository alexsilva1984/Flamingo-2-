//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se foremcompradas pelo menos 12. 
//Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

package exercicio05flamingo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de maçãs compradas :");
		double macascompradas = sc.nextFloat ();
		if (macascompradas<12) {
		double calculomacas= macascompradas*1.30;
		System.out.println("O valor a ser pago será "+calculomacas);
		
		}else if (macascompradas>=12) {
		
		double calculomacas=macascompradas*1.00;
		System.out.println("O valor a ser pago será "+calculomacas);	
		sc.close();
		}
	}

}
