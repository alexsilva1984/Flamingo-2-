//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.

package exercicio08flamingo;

   public class Exercicio03 {
   public static void main(String[] args) {
	   int soma=0;
       for(int i = 2; i <= 500; i+=2){
          soma+=i;
       }
       System.out.println("Pares: " +  soma);
	    }

	

	}


