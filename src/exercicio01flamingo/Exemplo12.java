package exercicio01flamingo;

import java.util.Scanner;

public class Exemplo12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Operadores Aritiméticos//
		//Resto da Divisão//
		
		System.out.println("Digite um valor");
		int valor1=sc.nextInt();
		System.out.println("Digite um valor");
		int valor2=sc.nextInt();	
		int restodadivisao = valor1%valor2;
		System.out.println("A o resto da divisão é:" +restodadivisao);
		sc.close();
		
		
	
		}

}



