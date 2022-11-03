//Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

package exercicio05flamingo;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int valor = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int valor1 = sc.nextInt();
		
		
		if (valor > valor1){
			System.out.printf("O primeiro valor digitado é maior que o segundo. " );
		}
		else if (valor1 > valor) {
			System.out.printf("O  segundo valor digitado é maior que o primeiro." );
		}
		else {
			System.out.printf("Valores iguais não serão mostrados");
			sc.close();
		}
	}
}
