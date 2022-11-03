//Ler um valor e escrever se é positivo, negativo ou zero.

package exercicio07flamingo;

import java.util.Scanner;
public class Exercicio01 {
		    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor :");
		int valor = sc.nextInt ();
		if (valor>0) {
		
		System.out.println("O valor digitado positivo.");
		
		}else if (valor==0){
			System.out.println("O valor digitado é zero.");
		
		}else {
	   
			System.out.println("O valor digitado negativo.");
	   
			sc.close();
			
		}

	}

}


