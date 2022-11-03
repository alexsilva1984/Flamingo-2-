package exercicio09flamingo;

public class Exercicio07 {
	public static void main(String[] args) {
		int contadora = 1;
		while (contadora <= 10) {
			int contadoraFatorial = 1;
			int fatorial = 1;
			do {
				fatorial = fatorial * contadoraFatorial;
				contadoraFatorial++;
			} while (contadoraFatorial <= contadora);
			System.out.println("O fatorial de " + contadora + " é: " + fatorial);
			contadora = contadora+2;
		}
	}
}