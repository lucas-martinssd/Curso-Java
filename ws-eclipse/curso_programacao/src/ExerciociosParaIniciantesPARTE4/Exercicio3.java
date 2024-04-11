package ExerciociosParaIniciantesPARTE4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um valor: ");
		
		int n = sc.nextInt();
		
		for (int i=0; i<=n; i++) {
			double x = sc.nextDouble();
			
			double y = sc.nextDouble();
			
			double z = sc.nextDouble();
			
			double resultado = (x*2 + y*3 + z*5)/10;
			
			
			System.out.printf("%.1f%n",resultado);
		}

		
		sc.close();
	}

}
