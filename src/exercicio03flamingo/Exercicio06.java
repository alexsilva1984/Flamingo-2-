 
//Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
//A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e
//C a temperatura em Celsius.

package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a temperatura em Fahrenheit");
		int temperatura = sc.nextInt();
		int Celsius = (temperatura-32)*5/9;
		System.out.println("A temperatura em Celcius é: "+ Celsius+"º");
		sc.close();
		
	}

}
