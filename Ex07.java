package ex02Metodos;

public class Ex07 {
	
	public static int gerarNumeroAleatorio() {
		return (int) (Math.random()*100);
	}

	public static void main(String[] args) {
		System.out.println("Gerando n�mero aleat�rio entre 1 e 100: "+gerarNumeroAleatorio());

	}

}
