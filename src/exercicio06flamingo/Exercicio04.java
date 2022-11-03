// Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o
//aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, 
//solicitar a nota de exame, somar com o valor da média e obter nova média. Se a nova média for maior ou igual a 5,
//apresentar uma mensagem dizendo que o aluno foi aprovado em exame. 
//Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. 
//Apresentar com as mensagens o valor da média do aluno, para qualquer condição.

package exercicio06flamingo;

import java.util.Scanner;

public class Exercicio04 {

		public  static  void  main ( String [] args ) {
			Scanner  sc = new  Scanner ( System . in );
			System.out.println ( "Digite a Primeira Nota: " );
			int  primeiraNota = sc . nextInt ();
			System.out.println ( "Digite a Segunda Nota: " );
			int  segundaNota = sc . nextInt ();
			System.out.println ( "Digite a terceira Nota: " );
			int  terceiraNota = sc . nextInt ();
			System.out.println ( "Digite a quarta Nota: " );
			int  quartaNota = sc . nextInt ();
			int  mediaNota = ( primeiraNota + segundaNota + terceiraNota + quartaNota ) / 4 ;
			if ( mediaNota >= 7 ) {
				System.out.println ( "Aluno Aprovado Média: " + mediaNota );
			} else {
				System.out.println ( "Digite a Nota da Prova de Recuperação: " );
				int  quintaNota = sc . nextInt ();
				int  novaMedia = mediaNota + quintaNota / 2 ;
				if ( novaMedia >= 5 ) {
					System.out.println ( "Aluno Aprovado com a Média: " + novaMedia );
				} else {
					System.out.println ( "Aluno Reprovado Com a Média: " + novaMedia );
				}
				sc.close();
			}
		}
	}