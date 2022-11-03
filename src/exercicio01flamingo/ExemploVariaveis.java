package exercicio01flamingo;


public class ExemploVariaveis {


	static void mostrar() { 
		int valor=45; // Variavel local
		System.out.println("O valor da variavel é :"+valor);
	}
	
	public static void main(String[] args) {
		
		int data = 50; // Variável de Instância
		System.out.println("O valor da variável data é :"+data);
		
		exibir();
		mostrar();
		
	}
	static void exibir() {
		int valor=40;
		System.out.println("O valor da variavel é :"+valor);
	}
	

}