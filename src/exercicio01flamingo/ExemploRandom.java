package exercicio01flamingo;

public class ExemploRandom {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			int random=(int)(Math.random()*1000);
			System.out.println("O número randomico gerado é :"+random);	
		}
	}

}
