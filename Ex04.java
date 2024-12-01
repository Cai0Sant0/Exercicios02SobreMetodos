package ex02Metodos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex04 {
	
	public static float calcularPerimetroCirculo(float raio) {
		return (float) (Math.PI*(raio*raio)) ;
	}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo e descubra sua área");
		System.out.println("---------------------------------------------");
		
		
		System.out.print("Digite o raio: ");
		float raio = leitor.nextFloat();
		
		 DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.printf("A área do círculo é igual a: "+df.format(calcularPerimetroCirculo(raio))+" Cm²");
		
		leitor.close();
		
	}

}
