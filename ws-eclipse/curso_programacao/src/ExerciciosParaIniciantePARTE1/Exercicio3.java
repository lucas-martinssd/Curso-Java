package ExerciciosParaIniciantePARTE1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os primeiros quatro valores: ");

		int a = sc.nextInt();

		int b = sc.nextInt();

		int c = sc.nextInt();

		int d = sc.nextInt();

		float diferenca1 = a * b - c * d;

		System.out.println("A primeira diferença é: " + diferenca1);

		System.out.println("Informe os proximos quatro valores: ");

		int e = sc.nextInt();

		int f = sc.nextInt();

		float g = sc.nextInt();

		int h = sc.nextInt();

		float diferenca2 = e * f - g * h;

		System.out.println("A primeira diferença dos proximos valores é: " + diferenca2);

		sc.close();
	}

}
