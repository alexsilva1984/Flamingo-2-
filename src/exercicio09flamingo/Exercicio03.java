package exercicio09flamingo;

public class Exercicio03 {
	public static void main(String[] args) {
		int numero = 1;
		do {
			if (numero % 4 == 0)
				System.out.println(numero + " é divisível por 4 ");
			numero = numero + 1;
		} while (numero <= 200);
	}
}