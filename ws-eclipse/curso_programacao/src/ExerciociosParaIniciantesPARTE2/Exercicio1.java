package ExerciociosParaIniciantesPARTE2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Positivo");
		}
		
		sc.close();
	}

}
