package ex02Metodos;

import java.util.Scanner;

public class Ex03 {

	public static float calcularAreaRetangulo(float largura, float altura) {
		return largura*altura;
	}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a largura e altura do ret�ngulo para descobrir sua �rea");
		System.out.println("------------------------------------------------------------------");
		
		System.out.print("Digite a largura (Cm): ");
		float largura = leitor.nextFloat();
		
		System.out.print("Digite a altura (Cm): ");
		float altura = leitor.nextFloat();
		
		System.out.println("A �rea do ret�ngulo � igual a: "+calcularAreaRetangulo(largura,altura)+" Cm�");
		
		leitor.close();
		
		
	}

}
