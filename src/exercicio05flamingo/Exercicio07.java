//Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

package exercicio05flamingo;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int valor = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int valor1 = sc.nextInt();
		
		if (valor1 > valor){
			
			System.out.printf("Os numeros em ordem crescente são: " +valor +" e " +valor1);
		}
		else if (valor > valor1) {
			
			System.out.printf("Os numeros em ordem crescente são." +valor1 +" e " +valor);
		}
		else {
			System.out.printf("Valores iguais não serão mostrados");
			sc.close();
		}
	}
}
