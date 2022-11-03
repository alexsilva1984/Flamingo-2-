//) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e  
//quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média 
//((quantidademédia = quantidade máxima + quantidade mínima)/2).
//Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', 
//senão escrever a mensagem 'Efetuar compra'.


package exercicio05flamingo;

import java.util.Scanner;

public class Exercicio12 {

		    public static void main(String[] args) {
			System.out.println("Digite a quantidade em estoque: ");
			Scanner sc = new Scanner(System.in);
			int quantidadeestoque = sc.nextInt();
			System.out.println("Digite a quantidade máxima para o estoque: ");
			int quantidademaximadoestoque = sc.nextInt();
			System.out.println("Digite a quantidade minima para o estoque: ");
			int quantidademinimadoestoque = sc.nextInt();
			int quantidademediadoestoque = (quantidademaximadoestoque+quantidademinimadoestoque)/2;
			if (quantidadeestoque>=quantidademediadoestoque) {
				System.out.println("Não efetuar compra");
			}else {
				System.out.println("Efetuar compra");
				sc.close();
			}

	}

}



