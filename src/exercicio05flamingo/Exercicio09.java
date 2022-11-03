/*A jornada de trabalho semanal de um funcionário é de 40 horas. 
O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular 
com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, 
caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/


package exercicio05flamingo;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora trabalhada: ");
		double horatrabalhada = sc.nextDouble();
		System.out.println("Digite a o Salário da Hora trabalhada");
		double salariohora = sc.nextDouble();
	    double salariomensal =(horatrabalhada*salariohora);
		if(horatrabalhada>160){
		double salariocomhoraextra = ((horatrabalhada * 50) / 100) + (horatrabalhada * salariohora);
		System.out.println("O Salário do funcionário co horas extras foi de: R$"+salariocomhoraextra);
		}else{
		
		System.out.println("O Salário do funcionário sem horas extras foi de: R$"+salariomensal); 
		sc.close();
		}

	}
}

	


