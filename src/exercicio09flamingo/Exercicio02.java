package exercicio09flamingo;

public class Exercicio02 {
	public static void main(String[] args) {
		int soma = 0;
		int par = 2;

		do {
			soma = soma + par;
			par = par + 2;
			System.out.println(" o somatório dos pares é: " + soma);

		} while (par <= 500);
	}
}
