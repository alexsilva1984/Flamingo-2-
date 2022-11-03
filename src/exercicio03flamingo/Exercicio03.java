 //Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.  
//Calcular e escrever o valor do novo salário.

package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salário");
		float salario = sc.nextFloat();

		System.out.println("Digite a porcentagem");
		float porcentagem = sc.nextFloat();

		float NovoSalario = (salario * porcentagem) / 100 + salario;
		System.out.println("O Novo salário é : " + NovoSalario);
		sc.close();

	}

}
