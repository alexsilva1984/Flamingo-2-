//Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua

//apresentação, caso o valor não seja maior que três.

package exercicio06flamingo;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner  sc = new  Scanner ( System . in );
		System.out.println ( "Digite um valor : " );
	    int numero = sc . nextInt ();
		if (numero==3) {
	    System.out.println ( "Numero igual a 3 ");
		} else if (numero<3) {
        System.out.println ( "Numero menor que 3 ");
        }else { 
	    System.out.println ( "Numero invalido ");
        sc.close();
       }
}

}

