package ExerciociosParaIniciantesPARTE4;

import java.util.Scanner;

public class Exercicio1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um valor inteiro");
		
		int x = sc.nextInt();
		
		int i;
		for (i=0; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}

}
