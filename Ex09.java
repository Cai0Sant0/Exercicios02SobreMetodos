package ex02Metodos;

import java.util.Scanner;

public class Ex09 {
	
	public static String inverterString(String palavraNormal) {
		
		String palavraInvertida = "";
		
		for(int i = palavraNormal.length()-1; i >= 0; i--) {
			palavraInvertida += palavraNormal.charAt(i);
		}
		
		return palavraInvertida;	
}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite uma palavra e a veja ao contrário");
		System.out.println("------------------------------------------");
		
		System.out.print("Digite algo: ");
		String palavra = leitor.nextLine();
		
		System.out.println("A palavra invertida ficou assim: "+ inverterString(palavra) );
		
		leitor.close();
	}

}
