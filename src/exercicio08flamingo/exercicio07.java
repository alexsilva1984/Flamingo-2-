
//Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. 
//A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. 
//Esta série se caracteriza pela soma de um termo atual com o seu anterior subseqüente, 
//para que seja formado o próximo valor da seqüência. Portanto começando com os números 1, 1 o próximo termo
//é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.
package exercicio08flamingo;

public class exercicio07 {

	public static void main(String[] args) {
		

		    int n1 = 1;
		    int n2 = 0;
		    
		         
		    for (int i = 1; i <= 15; i++){
		      if (i < 2){
		          
		          System.out.println(1);
		          
		      } else {
		        n1 = n1 + n2;
		        n2 = n1 - n2;
		       
		    
		    System.out.println(n1);
		      }
		    }
		    }
		          
		}

	


