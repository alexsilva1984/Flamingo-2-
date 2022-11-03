package orientacaoobjeto;

public class Pessoa02 {
	
	String[] nome = {"Alex", "José", "Isaque"};
	int[] idade = {38, 19, 30};
	String[] profissao = {"Analista de TI", "Administrador", "Pelezeiro"};

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Pessoa02 cadastro = new Pessoa02();
			System.out.println("O nome da pessoa é: "+cadastro.nome[i]);
			System.out.println("A idade da pessoa é: "+cadastro.idade[i]);
			System.out.println("A profissão da pessoa é: "+cadastro.profissao[i]);
		}

	}

}
