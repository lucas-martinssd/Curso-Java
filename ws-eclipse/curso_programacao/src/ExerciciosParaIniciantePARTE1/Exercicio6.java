package ExerciciosParaIniciantePARTE1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os três valores: ");
		
		double a = sc.nextDouble();
		
		double b = sc.nextDouble();
		
		double c = sc.nextDouble();
		
		double triangulo = (a*c)/2;
		
		double circulo = 3.14159 * Math.pow(c, 2);
		
		double trapezio = (a+b)*c/2;
		
		double quadrado = b*b;
		
		double retangulo = a*b;
		
		System.out.printf("A área do triangulo é: %.3f%n", triangulo);
		
		System.out.printf("A área do circulo é: %.3f%n", circulo);
		
		System.out.printf("A área do trapezio é: %.3f%n", trapezio);
		
		System.out.printf("A área do quadrado é: %.3f%n", quadrado);
		
		System.out.printf("A área do retangulo é: %.3f%n", retangulo);
		
		sc.close();
	}

}
