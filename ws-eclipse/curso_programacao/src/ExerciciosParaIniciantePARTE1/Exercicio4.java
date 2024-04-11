package ExerciciosParaIniciantePARTE1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número do funcionario 1, "
				+ "suas horas trabalhadas e o valor que recebe "
				+ "por hora: ");
		
		int numero1 = sc.nextInt();
		
		int horas1 = sc.nextInt();
		
		double valor1 = sc.nextDouble();
		
		double salario1 = horas1 * valor1;
		
		System.out.printf("O numero do funcionário é: %d e o "
				+ "seu salario é de %.2f dolares%n", numero1, salario1);
		
		System.out.println("Informe o número do funcionario 2, "
				+ "suas horas trabalhadas e o valor que recebe "
				+ "por hora: ");
		
		int numero2 = sc.nextInt();
		
		int horas2 = sc.nextInt();
		
		double valor2 = sc.nextDouble();
		
		double salario2 = horas2 * valor2;
		
		System.out.printf("O numero do funcionário 2 é: %d e o "
				+ "seu salario é de %.2f dolares%n", numero2, salario2);
		
		System.out.println("Informe o número do funcionario 3, "
				+ "suas horas trabalhadas e o valor que recebe "
				+ "por hora: ");
		
		int numero3 = sc.nextInt();
		
		int horas3 = sc.nextInt();
		
		double valor3 = sc.nextDouble();
		
		double salario3 = horas3 * valor3;
		
		System.out.printf("O numero do funcionário é: %d e o "
				+ "seu salario é de %.2f dolares%n", numero3, salario3);
		
		sc.close();
	}

}
