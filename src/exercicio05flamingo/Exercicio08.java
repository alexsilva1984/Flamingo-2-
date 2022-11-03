//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) 
//e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e 
//que o jogo pode iniciar em um dia e terminar no dia seguinte.

package exercicio05flamingo;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("o horário do inicio da partida: ");	
		int horarioinicialdapartida = sc.nextInt();
		System.out.println("o horário do final da partida: ");
		int horariofinaldapartida = sc.nextInt();
		int  totaldehorasjogadas = (horariofinaldapartida-horarioinicialdapartida);
		int totaldehorasjogadas1 = totaldehorasjogadas+24;
		 if (totaldehorasjogadas>0) {
			 System.out.println("O horário total da partida foi de "+totaldehorasjogadas+" horas.");
		 }else if (totaldehorasjogadas<0) {
          
			 System.out.println("O horário total da partida foi de "+totaldehorasjogadas1 +" horas.");
		 sc.close();
		 
		

		 }
		 }
}
