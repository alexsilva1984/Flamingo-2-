package exercicio01flamingo;


import java.util.Scanner;

//Descobrir massa corporal//

public class ExercicioSala02 {

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	String nome;
	    	
	    	System.out.println("Digite o seu nome");
			nome = sc.next();
	    	
	    	System.out.println("Digite o peso");
	        double peso = sc.nextDouble();
	        System.out.println("Digite a altura");
	        double altura = sc.nextDouble();
	        double imc = peso / (altura * altura);
	        System.out.println(imc);

	        if (imc <= 18.5) {
	            System.out.println(nome+" Sua Classificação é de Magreza");
	        } else if (imc >= 18.5 & imc <= 24.9) {
	            System.out.println(nome+" Sua Classificação Está Dentro do Normal");
	        } else if (imc >= 25.0 && imc <= 29.9) {
	            System.out.println(nome+" Sua Classificação é de Sobrepeso I");
	        } else if (imc >= 30.0 && imc <= 39.9) {
	            System.out.println(nome+" Sua Classificação é Obesidade II");
	        } else if (imc >= 40.0 ) {
	            System.out.println(nome+" Sua Classificação é Obesidade Grave III");
	            sc.close();
	        }
	    }
	}