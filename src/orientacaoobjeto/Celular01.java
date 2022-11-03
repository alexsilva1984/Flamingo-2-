package orientacaoobjeto;

public class Celular01 {
	String marca = "Sansumg";
	String modelo = "S20 FE";
	String cor = "Preto";
	String memoriaRam = "16 GB";
	String camera = "32 MP";
	String processador = "Octacore";
	public static void main(String[] args) {
    Celular01 cadastro01 = new Celular01();
    System.out.println("A marca do celular é: "+cadastro01.marca);
	System.out.println("O modelo do celular é: "+cadastro01.modelo);
	System.out.println("A cor do celular é: "+cadastro01.cor);
	System.out.println("A memória Ram do celular é: "+cadastro01.memoriaRam);
	System.out.println("A qualidade da camera do celular é: "+cadastro01.camera);
	System.out.println("O processador do celular é: "+cadastro01.processador);
    

}
}