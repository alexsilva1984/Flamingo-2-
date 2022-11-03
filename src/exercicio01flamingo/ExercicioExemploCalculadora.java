package exercicio01flamingo;


import java.util.Scanner;

public class ExercicioExemploCalculadora {
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {

		
		System.out.println("Digite um número :");
		int numero = sc.nextInt();
		int contadora = 1;
		
		while (contadora <= 10) {
			System.out.println(numero+" x "+contadora+" = "+numero*contadora);
			contadora++;
				}
		
		

	}



	}


