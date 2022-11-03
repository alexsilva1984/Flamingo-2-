package orientacaoobjeto;

public class Pessoa01 {
	String[] nome = {"Alex", "José", "Isaque"};
	int[] idade = {38, 19, 30};
	String[] profissao = {"Analista de TI", "Administrador", "Pelezeiro"};


	public static void main(String[] args) {
		Pessoa01 cadastro01 = new Pessoa01();
		
		System.out.println("O nome da pessoa é: "+cadastro01.nome[0]);
		System.out.println("A idade da pessoa é: "+cadastro01.idade[0]);
		System.out.println("A profissão da pessoa é: "+cadastro01.profissao[0]);
		
		Pessoa01 cadastro02 = new Pessoa01();
		System.out.println("\nO nome da pessoa é: "+cadastro02.nome[1]);
		System.out.println("A idade da pessoa é: "+cadastro02.idade[1]); 
		System.out.println("A profissão da pessoa é: "+cadastro02.profissao[1]);
		
		Pessoa01 cadastro03 = new Pessoa01();
		System.out.println("\nO nome da pessoa é: "+cadastro03.nome[2]);
		System.out.println("A idade da pessoa é: "+cadastro03.idade[2]); 
		System.out.println("A profissão da pessoa é: "+cadastro03.profissao[2]);
		
	}

}
