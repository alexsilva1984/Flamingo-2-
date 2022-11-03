package exercicio01flamingo;


public class ExemploWhileComContinue {

	public static void main(String[] args) {
		int contadora = 0;
		while (contadora < 40) {

			if (contadora == 20) {
				contadora++;
				continue;
			}
			System.out.println(contadora);
			contadora++;
		}

	}

}
