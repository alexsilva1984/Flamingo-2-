// Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o 
//número é par ou ímpar.

package exercicio06flamingo;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner  sc = new  Scanner ( System . in );
		System.out.println ( "Digite Um Número: " );
		int  numero = sc . nextInt ();
		if ( numero % 2 == 0 ) {
			System.out.println ( "Número:" + numero + "É Par" );
		} else {
			System.out.println ( "Número:" + numero + "É Impar" );
			}
		sc .close ();
	}
}