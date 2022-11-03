 //Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
// Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que 
// ultrapassar este valor, calcular e escrever o seu salário total.

package exercicio05flamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salario fixo do funcionário: ");	
		double salariofixo = sc.nextInt();
		System.out.println("Digite o valor das vendas mensais do funcionário: ");
		double valordevendas = sc.nextDouble();
		double  salariomensal = (salariofixo+valordevendas);
		
		 if (valordevendas<=1500) {
			 double salariomensalfinal =(valordevendas*3)/100+salariomensal;
			 System.out.println("O Salario final do funcionário é de R$"+salariomensalfinal);
		 }else if (valordevendas>1500) {
			 double salariomensalfinal =(valordevendas*5)/100+salariomensal;
			 System.out.println("O Salario final do funcionário é de R$"+salariomensalfinal);
		 sc.close();
		 
		

		 }
		 }
}

	


