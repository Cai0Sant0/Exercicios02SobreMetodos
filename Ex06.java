package ex02Metodos;

import java.util.Scanner;
import java.math.BigInteger;

public class Ex06 {
	
	public static boolean ehPrimo(int num) {
		 BigInteger testePrimo = new BigInteger(String.valueOf(num));
		
		return testePrimo.isProbablePrime(1);
	}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero e descubra se ele � primo");
		System.out.println("---------------------------------------------");
		
		System.out.print("Digite o n�mero: ");
		int numero = leitor.nextInt();
		
		System.out.println(ehPrimo(numero));
		
		leitor.close();
	}

}
