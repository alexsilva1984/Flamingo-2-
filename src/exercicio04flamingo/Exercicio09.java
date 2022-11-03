 //Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e 
//também o valor do percentual de reajuste (variável PR) a ser atribuído.
//Apresentar o valor do novo salário (variável NS).

package exercicio04flamingo;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Salário Mensal (R$): ");
		float Salario_Mensal=sc.nextFloat();
		System.out.println("Percentual De Reajuste(EM%): ");
		float Percentural_De_Reajuste=sc.nextFloat();
		float Novo_Salário=Salario_Mensal+(Percentural_De_Reajuste/100)*Salario_Mensal;
		System.out.println("Novo Valor DO Salário É: "+Novo_Salário+"R$");
		sc.close();

	}

}
