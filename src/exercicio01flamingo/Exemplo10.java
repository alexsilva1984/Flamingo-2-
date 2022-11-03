package exercicio01flamingo;

import java.util.Scanner;

public class Exemplo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Operadores Aritiméticos//
		//Multipliçação//
		
		System.out.println("Digite um valor");
		int valor1=sc.nextInt();
		System.out.println("Digite um valor");
		int valor2=sc.nextInt();	
		int multiplicacao = valor1*valor2;
		System.out.println("A soma dos valores é:" +multiplicacao);
		sc.close();
		
	
		}

}
