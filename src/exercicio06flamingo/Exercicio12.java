// Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com saída uma das 
//seguintes mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a mensagem "Ilma Sra.", para o sexo 
//informado como feminino. Apresente também junto da mensagem de saudação o nome previamente informado.

package exercicio06flamingo;


       

           import java.util.Scanner;
           public class Exercicio12 {

		  public static void main(String[] args) {
			  Scanner  sc = new  Scanner ( System . in );
			  
		        String sexo;
		        String nome;
		 
		        System.out.println("Informe o seu nome");
		         nome = sc.next(); 
		 
		        System.out.println("Informe o sexo");
		        sexo = sc.next();
		 
		        if (sexo.equals("Masculino") || (sexo.equals("masculino"))) {
		            System.out.println("Ilmo Sr " + nome);
		 
		        } else {
		            if (sexo.equals("Femenino") || (sexo.equals("femenino"))) {
		                System.out.println("Ilma Sra " + nome);
		 
		            }else{
		                System.out.println("Sexo inválido!");
		            }
		 
		            System.out.println("O seu nome é " + nome);
		            sc.close();
		        }
		 
		    }
		}
           
          
	    
	

	


