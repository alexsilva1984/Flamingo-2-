package orientacaoobjeto;

public class Bicicleta {
	String[] marca = {"KSW","Caloi","Monark"};
	String[] cor = {"Preto", "Azul","Vermelho"};
	String[] tamanho = {"P","M","G"};
	int[] aro = {29,24,20};
	int[] marchas = {27,24,21};

	public static void main(String[] args) {
	Bicicleta cadastro01 = new Bicicleta();
	
	System.out.println("A marca da bicicleta é: "+cadastro01.marca[0]);
	System.out.println("A cor da bicicleta é: "+cadastro01.cor[0]);
	System.out.println("A cor da bicicleta é: "+cadastro01.tamanho[0]);
    System.out.println("O tamanho do aro da bicicleta é: "+cadastro01.aro[0]);
    System.out.println("A quantidade de marchas da bicicleta é: "+cadastro01.marchas[0]);
    
    Bicicleta cadastro02 = new Bicicleta();
    
	System.out.println("A marca da bicicleta é: "+cadastro02.marca[1]);
	System.out.println("A cor da bicicleta é: "+cadastro02.cor[1]);
	System.out.println("A cor da bicicleta é: "+cadastro02.tamanho[1]);
    System.out.println("O tamanho do aro da bicicleta é: "+cadastro02.aro[1]);
    System.out.println("A quantidade de marchas da bicicleta é: "+cadastro02.marchas[1]);
    
    Bicicleta cadastro03 = new Bicicleta();
    
	System.out.println("A marca da bicicleta é: "+cadastro03.marca[2]);
	System.out.println("A cor da bicicleta é: "+cadastro03.cor[2]);
	System.out.println("A cor da bicicleta é: "+cadastro03.tamanho[2]);
    System.out.println("O tamanho do aro da bicicleta é: "+cadastro03.aro[2]);
    System.out.println("A quantidade de marchas da bicicleta é: "+cadastro03.marchas[2]);
}
}