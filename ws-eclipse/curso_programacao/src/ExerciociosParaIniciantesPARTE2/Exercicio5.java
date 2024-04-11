package ExerciociosParaIniciantesPARTE2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infome o codigo e a quantidade: ");
		
		int codigo = sc.nextInt();
		
		int quantidade = sc.nextInt();
		
		double preco;
		if (codigo == 1) {
			preco = 4;
		}
		else if (codigo == 2) {
			preco = 4.5;
		}
		else if (codigo == 3) {
			preco = 5;
		}
		else if (codigo == 4) {
			preco = 2;
		}
		else if (codigo == 5) {
			preco = 1.5;
		}
		else {
			preco = 0;
		}
		
		double conta = preco * quantidade;
		
		System.out.println("Total: R$ " + conta);
		
		sc.close();
	}

}
