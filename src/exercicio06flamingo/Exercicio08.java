//Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.

package exercicio06flamingo;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner  sc = new  Scanner ( System . in );
		System.out.println ( "Digite O Primeiro Número:" );
		int  primeiroNumero = sc . nextInt ();
		System.out.println ( "Digite O Segundo Número:" );
		int  segundoNumero = sc . nextInt ();
		System.out.println ( "Digite O Terceiro Numero:" );
		int  terceiroNumero = sc . nextInt ();
		System.out.println ( "Digite O Quarto Número:" );
		int  quartoNumero = sc . nextInt ();
		System.out.println ( "Digite O Quinto Numero:" );
		int  quintoNumero = sc . nextInt ();
		// Valor menor
		if ( primeiroNumero < segundoNumero ) {
			if ( primeiroNumero < terceiroNumero ) {
				if ( primeiroNumero < quartoNumero ) {
					if ( primeiroNumero < quintoNumero ) {
						System.out.println ( "\nMenor valor: " + primeiroNumero );

					}
				}
			}
		}
		if ( segundoNumero < primeiroNumero ) {
			if ( segundoNumero < terceiroNumero ) {
				if ( segundoNumero < quartoNumero ) {
					if ( segundoNumero < quintoNumero ) {
						System.out.println ( "\nMenor valor: " + segundoNumero );
					}
				}
			}
		}
		if ( terceiroNumero < primeiroNumero ) {
			if ( terceiroNumero < segundoNumero ) {
				if ( terceiroNumero < quartoNumero ) {
					if ( terceiroNumero < quintoNumero ) {
						System.out.println ( "\nMenor valor: " + terceiroNumero );
					}
				}
			}
		}

		if ( quartoNumero < primeiroNumero ) {
			if ( quartoNumero < segundoNumero ) {
				if ( quartoNumero < terceiroNumero ) {
					if ( quartoNumero < quintoNumero ) {
						System.out.println ( "\nMenor valor: " + quartoNumero );
					}
				}
			}
		}
		if ( quintoNumero < primeiroNumero ) {
			if ( quintoNumero < segundoNumero ) {
				if ( quintoNumero < terceiroNumero ) {
					System.out.println ( "\nMenor valor: " + quintoNumero );
				}
			}
		}
		// Valor Maior

		if ( primeiroNumero > segundoNumero ) {
			if ( primeiroNumero > terceiroNumero ) {
				if ( primeiroNumero > quartoNumero ) {
					if ( primeiroNumero > quintoNumero ) {
						System.out.println ( "\nMaior valor: " + primeiroNumero );
					}
				}
			}
		}
		if ( segundoNumero > primeiroNumero ) {
			if ( segundoNumero > terceiroNumero ) {
				if ( segundoNumero > quartoNumero ) {
					if ( segundoNumero > quintoNumero ) {
						System.out.println ( "\nMaior valor: " + segundoNumero );
					}
				}
			}
		}

		if ( terceiroNumero > primeiroNumero ) {
			if ( terceiroNumero > segundoNumero ) {
				if ( terceiroNumero > quartoNumero ) {
					if ( terceiroNumero > quintoNumero ) {
						System.out.println ( "\nMaior valor: " + terceiroNumero );
					}
				}
			}
		}

		if ( quartoNumero > primeiroNumero ) {
			if ( quartoNumero > segundoNumero ) {
				if ( quartoNumero > terceiroNumero ) {
					if ( quartoNumero > quintoNumero ) {
						System.out.println ( "\nMaior valor: " + quartoNumero );
					}
				}
			}
		}
		if ( quintoNumero > primeiroNumero ) {
			if ( quintoNumero > segundoNumero ) {
				if ( quintoNumero > terceiroNumero ) {
					if ( quintoNumero > quartoNumero ) {
						System.out.println ( "\nMaior valor: " + quintoNumero );
					}
				}
				sc .close ();
			}
		}
	}
}
