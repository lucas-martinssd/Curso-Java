package ExerciciosParaIniciantePARTE1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o codigo da peça 1, "
				+ "o número de peças e o valor unitário dela: ");
		
		int codigo1 = sc.nextInt();
		
		int numero1 = sc.nextInt();
		
		double valor1 = sc.nextDouble();
		
		System.out.println("Informe o codigo da peça 2, "
				+ "o número de peças e o valor unitário dela: ");
		
		int codigo2 = sc.nextInt();
		
		int numero2 = sc.nextInt();
		
		double valor2 = sc.nextDouble();
		
		double pagar = (numero1 * valor1) + (numero2 * valor2);
		
		System.out.printf("O valor a ser pago é R$ %.2f%n ", pagar);
		
		sc.close();
	}

}
