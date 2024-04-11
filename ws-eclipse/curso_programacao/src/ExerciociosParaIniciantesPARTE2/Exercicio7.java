package ExerciociosParaIniciantesPARTE2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe as duas coordenadas:");
		
		double x = sc.nextDouble();
		
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x != 0 && y == 0) {
			System.out.println("Eixo X");
		}
		else if (y != 0 && x == 0) {
			System.out.println("Eixo Y");
		}
		else if (0 < x && 0 < y) {
			System.out.println("Q1");
		}
		else if (x < 0 && 0 < y) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (0 < x && y < 0) {
			System.out.println("Q4");
		}
		else {
			System.out.println("Fora do plano");
		}
		
		sc.close();
	}

}
