package ExerciociosParaIniciantesPARTE4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o número:");
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double x = sc.nextInt();
			
			double y = sc.nextInt();
			
			if (y != 0) {
				double resultado = x/y;
				System.out.println(resultado);
			}
			else {
				System.out.println("divisão impossivel");
			}
		}
		
		
		
		sc.close();
	}

}
