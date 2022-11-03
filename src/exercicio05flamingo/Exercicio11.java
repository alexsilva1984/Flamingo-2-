//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
//Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). 
//Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', 
//senão escrever a mensagem 'Saldo Negativo'.

package exercicio05flamingo;

import java.util.Scanner;


public class Exercicio11 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Digite o numero da conta: ");	
		Scanner sc = new Scanner(System.in);
		int numerodaconta = sc.nextInt();
        System.out.println("Informe o saldo da conta: ");
        int saldodaconta = sc.nextInt();
        System.out.println("Informe o débito da conta: ");
        int debitodaconta = sc.nextInt();
        System.out.println("Informe o credito da conta: ");
        int creditodaconta = sc.nextInt();
        int saldoatual = (saldodaconta-debitodaconta+creditodaconta);
        if (saldoatual>=0) {
        	int saldopositivo=(saldoatual);
        	System.out.println("O Saldo da conta é R$"+saldopositivo+ ".O saldo está Positivo");	
        }else if  (saldoatual<0){
        	int saldonegativo =(saldoatual);
	     System.out.println("O Saldo da conta é R$"+saldonegativo+ ". O saldo está Negativo");	
	      sc.close();
             
        }
	}
	
}





