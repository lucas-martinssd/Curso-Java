package ExerciciosParaIniciantePARTE1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor do primeiro raio do circulo: ");

		double raio1 = sc.nextDouble();

		double area1 = 3.14159 * Math.pow(raio1, 2);

		System.out.printf("A area do primeiro circulo é: %.4f%n", area1);

		System.out.println("Informe o valor do segundo raio do circulo: ");

		double raio2 = sc.nextDouble();

		double area2 = 3.14159 * Math.pow(raio2, 2);

		System.out.printf("A area do segundo circulo é: %.4f%n", area2);
		
		System.out.println("Informe o valor do terceiro raio do circulo: ");

		double raio3 = sc.nextDouble();

		double area3 = 3.14159 * Math.pow(raio3, 2);

		System.out.printf("A area do terceiro circulo é: %.4f%n", area3);

		sc.close();
	}

}
