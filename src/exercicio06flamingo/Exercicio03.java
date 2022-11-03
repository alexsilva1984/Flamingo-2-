//Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o 
//aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. 
//Se o aluno não foi aprovado, indicar uma mensagem informando esta condição.
//Apresentar junto das mensagens o valor da média do aluno para qualquer condição.

package exercicio06flamingo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a  Primeira Nota: ");
		int primeiraNota = sc.nextInt();
		System.out.println("Digite a Segunda Nota: ");
		int segundaNota = sc.nextInt();
		System.out.println("Digite a terceira Nota: ");
		int terceiraNota = sc.nextInt();
		System.out.println("Digite a quarta Nota: ");
		int quartaNota = sc.nextInt();
		int mediaNota = (primeiraNota + segundaNota+ terceiraNota + quartaNota) / 4;
		if (mediaNota >= 5) {
			System.out.println("Aluno Aprovado Média: " + mediaNota);
		} else {
			System.out.println("Aluno Reprovado Média: " + mediaNota);
		}
		sc.close();
	}
}