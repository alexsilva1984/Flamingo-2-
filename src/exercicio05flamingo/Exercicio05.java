//Ler o ano atual e o ano de nascimento de uma pessoa. 
//Escrever uma mensagem que diga se ela poderá ou não votar este ano 
//(não é necessário considerar o mês em que a pessoa nasceu).

package exercicio05flamingo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		int anoatual = sc.nextInt ();
		System.out.println("Digite o ano de nascimento: ");
		int anonascimento = sc.nextInt ();
		int idade = (anoatual-anonascimento);
				if (idade>=16) {
					System.out.println("Pode Votar.");
					
				}else{
					System.out.println("Não pode votar.");
					sc.close();
		
				}
	}

}
