package exercicio01flamingo;

public class ExemploArryString02 {

	public static void main(String[] args) {
		
				String[]carros = {"Ford", "Chevrolet" , "Volkswagen" , "Renault"};
				System.out.println(carros[0]);
				System.out.println(carros[1]);
				System.out.println(carros[2]);
				System.out.println(carros[3]);				
				
				carros[0]="BMW";
				carros[3]="Subaru";
				System.out.println(carros[0]);
				System.out.println(carros[1]);
				System.out.println(carros[2]);
				System.out.println(carros[3]);
				
				System.out.println(carros.length);
			}
		

	}


