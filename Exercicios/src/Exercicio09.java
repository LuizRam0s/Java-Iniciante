import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();

		while (A != 0 || B != 0) {

			if (A > 0.0 && B < 0.0) {
				System.out.println("Quarto");
			} else if (A < 0.0 && B < 0.0) {
				System.out.println("Terceiro");
			} else if (A < 0.0 && B > 0) {
				System.out.println("Segundo");
			} else if (A > 0.0 && B > 0) {
				System.out.println("Primeiro");
			} else {

			}
			A = sc.nextDouble();
			B = sc.nextDouble();
		}

		sc.close();
	}

}
