// Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, 
//utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).

package exercicio03flamingo;

 import java.util.Scanner;

 public class Exercicio09 {

	public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
   System.out.println("Digite o valor da prestação");
   float valor = sc.nextFloat();
   System.out.println("Digite o valor da taxa");
   float taxa = sc.nextFloat();
   System.out.println("Digite o tempo");
   float tempo = sc.nextFloat();
   float prestacao = valor+(valor*taxa/100)*tempo;
   System.out.println("O valor final da prestação será de:R$"+prestacao);
   sc.close();
	}

}
