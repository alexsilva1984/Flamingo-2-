package exercicio01flamingo;


import java.util.Scanner;

//Dias da Semana//

public class ExercicioSala01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero entre 1 e 7 :");
		int Dia = sc.nextInt();
		if (Dia==1) {
			System.out.println("O número digitado corresponde ao Domingo");
		}else if (Dia==2) {
			System.out.println("O número digitado corresponde a Segunda-Feira");
		}else if (Dia==3) {
			System.out.println("O número digitado corresponde a Terça-Feira");
		}else if (Dia==4) {
			System.out.println("O número digitado corresponde a Quarta-Feira");
		}else if (Dia==5) {
			System.out.println("O número digitado corresponde a Quinta-Feira");
		}else if (Dia==6) {
			System.out.println("O número digitado corresponde a Sexta-Feira");
		}else if (Dia==7) {
			System.out.println("O número digitado corresponde a Sabado");
	
				
		}else 
			System.out.println("Não corresponde");
		
		sc.close();
			
			
		}
	}


