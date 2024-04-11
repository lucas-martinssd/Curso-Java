package ExerciociosParaIniciantesPARTE3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o codigo:");

		int codigo = sc.nextInt();

		int alcool = 0;

		int gasolina = 0;

		int diesil = 0;

		while (codigo != 4) {
			if (codigo == 1) {
				alcool += 1;
			} else if (codigo == 2) {
				gasolina += 1;
			} else if (codigo == 3) {
				diesil += 1;
			}
			System.out.println("Digite o codigo:");

			codigo = sc.nextInt();
		}

		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesil: " + diesil);
		
		sc.close();
	}

}
