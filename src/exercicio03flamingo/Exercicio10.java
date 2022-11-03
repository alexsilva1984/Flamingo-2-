//Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, 
//e efetuar a troca dos valores de forma que a variável A passe a possuir o 
//valor da variável B e a variável B passe a possuir o valor da variável A.
//Apresentar os valores trocados.

package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		int VariavelA;
	     int VariavelB;
	     int Auxiliar;

	     System.out.println("Digite o valor da variavel A");

	     Scanner sc = new Scanner(System.in);
	     VariavelA= sc.nextInt();

	     System.out.println("Digite o valor da variavel B");
	     VariavelB= sc.nextInt();
	     
	     Auxiliar=VariavelA;
	     VariavelA=VariavelB;
	     VariavelB=VariavelA;

	     System.out.println("O valor de A é: " +VariavelB);
	     System.out.println("O valor de B é: " +Auxiliar);
	     sc.close();



	    }

	}
	