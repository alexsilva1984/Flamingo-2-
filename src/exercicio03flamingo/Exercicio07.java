// Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: 
//Volume = π*Raio2*Altura

package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do raio da  lata de óleo: ");
		double raio = sc.nextDouble();
		System.out.println("  Informe a altura da lata de óleo: ");
		double altura = sc.nextDouble();
		double volume = Math.PI * (raio * raio) * altura;
		System.out.println(volume + "  é o valor do volume da lata de óleo.");
		sc.close();
	}

}
