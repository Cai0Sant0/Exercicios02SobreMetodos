package ex02Metodos;

import java.util.Scanner;

public class Ex02 {
	
	public static void imprimirQuadrado(int numero) {
		System.out.println("O quadrado de "+ numero+ " �: "+ numero*numero);
	}

	public static void main(String[] args) {
		Scanner leitor  = new Scanner(System.in);
		
		System.out.println("Digite um n�mero e descubra o seu quadrado");
		System.out.println("---------------------------------------------");
		
		System.out.print("Digite o n�mero: ");
		int num = leitor.nextInt();
		
		imprimirQuadrado(num);
		
		leitor.close();

	}

}
