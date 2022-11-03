package exercicio09flamingo;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Dividendo: ");
		float dividendo = sc.nextFloat();
		System.out.println("Digite o Divisor: ");
		float divisor = sc.nextFloat();
		float conta = dividendo; 
		float quociente = 0;
		float resto = 0;
		do {
			conta = conta - divisor;
			quociente = quociente+1;
		} while (conta >= divisor);
		sc.close();
		resto = conta;
		System.out.println("Resultado: " + quociente);
		System.out.println("Resto: " + resto);
	}
}
