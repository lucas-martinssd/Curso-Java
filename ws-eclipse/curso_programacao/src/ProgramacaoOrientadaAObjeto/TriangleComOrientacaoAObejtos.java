package ProgramacaoOrientadaAObjeto;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class TriangleComOrientacaoAObejtos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Escreva os lados do primeiro triangulo:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Escreva os lados do segundo triangulo:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();

		System.out.println("Area primeiro triangulo: " + areaX);
		System.out.println("Area segundo triangulo: " + areaY);

		if (areaX > areaY) {
			System.out.println("A maior area é do primeiro triangulo");
		} else {
			System.out.println("A maior area é do segundo triangulo");
		}

		sc.close();
	}

}
