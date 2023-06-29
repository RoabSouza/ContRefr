package chorume;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double donate = 0;
		double Vfinal = 0;
		double Ccont = 0;
		int cont = 0;

		final double preco = 5.0;

		while (donate != -1) {
			System.out.println("valor do donate");
			donate = sc.nextDouble();

			Vfinal += donate;
			Ccont += donate;

			if (Ccont >= preco) {
				cont++;
				Ccont = 0;
			}

			System.out.println("cervas compradas: " + cont);
			System.out.println("dinheiro arrecadado foi de :" + Vfinal);

		}

	}
}
