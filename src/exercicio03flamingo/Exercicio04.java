//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a 
//porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
//escrever um algoritmo para ler o custo de fábrica de um carro, calcular e 
//escrever o custo final ao consumidor.

package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de custo de fábrica:");
		float ValorCustoDeFabrica=sc.nextFloat();
		int PorcentagemDeValorDoDistribuidor=28;
		int PorcentagemDeValorDeImposto=45;
		float ValorDoDistribuidor = ValorCustoDeFabrica*PorcentagemDeValorDoDistribuidor/100;
		float ValorDeImposto = ValorCustoDeFabrica*PorcentagemDeValorDeImposto/100;
		float ValorCustoDoConsumidor = ValorCustoDeFabrica+ValorDoDistribuidor+ValorDeImposto;
		System.out.println("O Custo do Consumidor é:"+ValorCustoDoConsumidor+" R$");
sc.close();		

	}

}
