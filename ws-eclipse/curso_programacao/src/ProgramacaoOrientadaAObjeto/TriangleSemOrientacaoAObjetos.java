package ProgramacaoOrientadaAObjeto;

import java.util.Locale;
import java.util.Scanner;

public class TriangleSemOrientacaoAObjetos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva os lados do primeiro triangulo:");

		double a = sc.nextDouble();

		double b = sc.nextDouble();

		double c = sc.nextDouble();

		System.out.println("Escreva os lados do segundo triangulo:");

		double d = sc.nextDouble();

		double e = sc.nextDouble();

		double f = sc.nextDouble();
		
		double p1 = (a+b+c)/2;
		
		double p2 = (d+e+f)/2;
		
		double area1 = Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c));
		
		double area2 = Math.sqrt(p2*(p2-d)*(p2-e)*(p2-f));
		
		System.out.println("Area primeiro triangulo: " + area1);
		
		System.out.println("Area segundo triangulo: " + area2);
		
		if (area1 > area2) {
			System.out.println("A maior area é do primeiro triangulo");
		}
		else {
			System.out.println("A maior area é do segundo triangulo");
		}
			


		sc.close();
	}

}
