//e o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,   
//receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade 
//(em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

package exercicio07flamingo;
import java.util.Scanner;

public class Exercicio11 {

	
	public static void main(String[] args) {
		double  valordamaca,valordomorango;
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Digite a quantidade de kilos do morango");
		double quantidadedomorango = sc.nextDouble(); 
		
		System.out.println("Digite a quantidade da maçã: ");
		double quantidadedamaca = sc.nextDouble();
		double quantidadedefrutas = quantidadedomorango+quantidadedamaca;
	    
		if (quantidadedomorango<=5)
	    {
        valordomorango=2.50*quantidadedomorango;       
	    }
	    else
	    {
	    valordomorango=2.20*quantidadedomorango;
	    }
	    if (quantidadedamaca<=5)
	    {
	    valordamaca=1.80*quantidadedamaca;
	    }
	    else
	    {
	    valordamaca=1.50*quantidadedamaca;
	    }
	    double valortotalpago = valordomorango+valordamaca;
	    System.out.println("O valor total a ser pago será de R$"+valortotalpago+ " e a quantidade total de kilos de frutas foi "+quantidadedefrutas+".");
	    sc.close();

	}
		 
		 
}

