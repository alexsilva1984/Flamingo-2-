//Escreva um algoritmo para ler as dimensões de um circulo (raio), 
//calcular e escrever a área do circulo. a=pi*r²

package exercicio02flamingo;

import java.util.Scanner;

public class Exercicio12 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da área do circulo");
		double area=sc.nextDouble();
		
		double circulo = Math.PI*(area*area);
		System.out.println("O área do circulo corresponde a: " +circulo);
		sc.close();
	 }
 }