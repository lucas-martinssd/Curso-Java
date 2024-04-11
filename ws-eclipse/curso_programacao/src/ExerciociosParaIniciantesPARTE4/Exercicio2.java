package ExerciociosParaIniciantesPARTE4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um valor inteiro:");
		
		int n = sc.nextInt();
		
		int i, in = 0, out = 0;
		for (i=0; i<n; i++) {
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		sc.close();
	}

}
