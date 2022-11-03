package exercicio09flamingo;

public class Exercicio04 {
	public static void main(String[] args) {
		int contadora = 0;
		double somatorio = 1;
		double inicio = 1;
		do {
			inicio = inicio * 2;
			somatorio += inicio;
			System.out.println(contadora + " casa: " + inicio);
			contadora ++;
		} while (contadora <= 64);
		System.out.println("a soma final é: "+somatorio);
	}
}
