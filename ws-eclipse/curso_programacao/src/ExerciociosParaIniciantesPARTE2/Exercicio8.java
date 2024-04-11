package ExerciociosParaIniciantesPARTE2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		
		double salario = sc.nextDouble();
		
		
		if (salario > 0 && salario < 2000.00) {
			System.out.println("Isento");
		}
		else if (salario > 2000.00 && salario < 3000.00) {
			double pagar = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n", pagar);
		}
		else if (salario > 3000.00 && salario < 4500.00) {
			double pagar = ((salario - 3000.00) * 0.18) 
					+ 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n", pagar);
		}
		else if (salario > 4500.00) {
			double pagar = ((salario - 4500.00)* 0.28) 
					+ 1500.00 * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n", pagar);
		}
		
		
		sc.close();
	}

}
