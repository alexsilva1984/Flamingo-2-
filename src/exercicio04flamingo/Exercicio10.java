/*Em uma eleição sindical concorreram ao cargo de presidente três candidatos 
(A, B e C). Durante a apuração dos votos foram computados votos nulos e 
votos em branco, além dos votos válidos para cada candidato. 
Deve ser criado um programa de computador que efetue a leitura da quantidade 
de votos válidos para cada candidato, além de efetuar também a leitura da quantidade
de votos nulos e votos em branco. Ao final o programa deve apresentar o número total
de eleitores, considerando votos válidos, nulos e em branco; o percentual 
correspondente de votos válidos em relação à quantidade de eleitores; o percentual
correspondente de votos válidos do candidato A em relação à quantidade de eleitores;
o percentual correspondente de votos válidos do candidato B em relação à quantidade
de eleitores; o percentual correspondente de votos válidos do candidato C em relação
à quantidade de eleitores; o percentual correspondente de votos nulos em relação à
quantidade de eleitores; e por último o percentual correspondente de votos em branco
em relação à quantidade de eleitores.*/

package exercicio04flamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de Votos Validos Para Candidato A");
		float CandidatoA = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Validos Para Candidato B");
		float CandidatoB = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Validos Para Candidato C");
		float CandidatoC = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Nulos");
		float VotoNulo = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Brancos");
		float VotoBranco = sc.nextFloat();
		float VotoValido = CandidatoA + CandidatoB + CandidatoC;
		float TotalEleitor = VotoValido + VotoNulo + VotoBranco;
		float PercentualValido = (VotoValido * 100) / TotalEleitor;
		float PercentualValidoA = (CandidatoA * 100) / TotalEleitor;
		float PercentualValidoB = (CandidatoB * 100) / TotalEleitor;
		float PercentualValidoC = (CandidatoC * 100) / TotalEleitor;
		float PercentualNulo = (VotoNulo * 100) / TotalEleitor;
		float PercentualBranco = (VotoBranco * 100) / TotalEleitor;
		System.out.println("O total de voto válido é: " + VotoValido);
		System.out.println("O total de eletitores são: " + TotalEleitor);
		System.out.println("o percentual de votos válidos é de " + PercentualValido + "%");
		System.out.println("o percentual de votos válidos para o candidato A é de " + PercentualValidoA + "%");
		System.out.println("o percentual de votos válidos para o candidato B é de " + PercentualValidoB + "%");
		System.out.println("o percentual de votos válidos para o candidato C é de " + PercentualValidoC + "%");
		System.out.println("o percentual de votos Nulos é de " + PercentualNulo + "%");
		System.out.println("o percentual de votos Brancos é de " + PercentualBranco + "%");
		sc.close();
	}

}
