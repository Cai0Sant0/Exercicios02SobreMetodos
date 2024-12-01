package ex02Metodos;
import java.util.Date;

public class Ex01 {
	
	public static void exibirHoraAtual() {
		Date data = new Date();
		
		String horaFormatada = data.getHours()+":"+ data.getMinutes();
		
		
		System.out.println("Horário atual: "+horaFormatada);
		
	}

	public static void main(String[] args) {
		exibirHoraAtual();

	}

}
