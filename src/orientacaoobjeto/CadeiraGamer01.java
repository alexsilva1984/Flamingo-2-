package orientacaoobjeto;

public class CadeiraGamer01 {
	
	String marca = "XT Racer";
	String modelo = "Viking Séries";
	String materialestofado = "Couro";
	String materialestrutura = "Metal";
	String cor = "Azul";

	public static void main(String[] args) {
		CadeiraGamer01 cadastro01 = new CadeiraGamer01();
		System.out.println("A marca da cadeira é "+cadastro01.marca);
		System.out.println("O modelo da cadeira é "+cadastro01.modelo);
		System.out.println("O Material do estofado da cadeira é "+cadastro01.materialestofado);
		System.out.println("O material da estrutura da cadeira é "+cadastro01.materialestrutura);
		System.out.println("A cor da cadeira é "+cadastro01.cor);

	}

}
