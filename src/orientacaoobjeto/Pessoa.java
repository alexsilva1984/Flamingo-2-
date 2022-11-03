package orientacaoobjeto;

public class Pessoa {
	String nome = "Alex";
	int idade = 38;
	String profissao = "Analista de TI";

	public static void main(String[] args) {
		Pessoa cadastro01 = new Pessoa();
		System.out.println("O nome da pessoa é: "+cadastro01.nome);
		System.out.println("A idade da pessoa é: "+cadastro01.idade);
		System.out.println("A profissão da pessoa é: "+cadastro01.profissao);

	}

}
