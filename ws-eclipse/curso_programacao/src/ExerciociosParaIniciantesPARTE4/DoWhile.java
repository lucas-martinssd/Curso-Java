package ExerciociosParaIniciantesPARTE4;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		char resposta = 's';
		do {
			System.out.println("Escreva a temperatura:");
			
			double temp = sc.nextDouble();
			
			double resultado = (9*temp/5) + 32;
			
			System.out.println("Equivalente em F: " + resultado);
			
			System.out.println("Quer repetir?");
			
			resposta = sc.next().charAt(0);
			
		} while(resposta == 's');
		
		
		
		
		
		sc.close();
	}

}
