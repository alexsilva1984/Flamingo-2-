package exercicio01flamingo;


import java.util.Scanner;

public class TemporizadorComTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cronometro Temporizador");
		System.out.println("Digite a hora");
		int horas=sc.nextInt();
		System.out.println("Digite os minutos");
		int minutos=sc.nextInt();
		System.out.println("Digite os segundos");
		int segundos=sc.nextInt();
	        for (int k = horas; k >= 0; k--) {
			for (int i = minutos; i >= 0; i--) {
			for (int j = segundos; j >= 0; j--) {
		    segundos=59;
		    minutos=59;
		System.out.println(k+":"+i+":"+j);
		sc.close();
		
		}
		}
	}
	}
	}



