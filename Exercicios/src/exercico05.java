import java.util.Locale;
import java.util.Scanner;

public class exercico05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo;
		codigo = sc.nextInt();
		
		double quantidade = sc.nextDouble();

		double cachorroQuente, x_Salada, x_Bacon, torradaSimples, refrigerante;

		if (codigo == 1) {
			cachorroQuente = quantidade * 4.00;
			System.out.printf("Voce comeu %.0f cachorros quentes. O valor a pagar e %.2f", quantidade, cachorroQuente);
		} else if (codigo == 2) {
			x_Salada = quantidade * 4.50;
			System.out.printf("Voce comeu %.0f x-saladas. O valor a pagar e %.2f", quantidade, x_Salada);
		} else if (codigo == 3) {
			x_Bacon = quantidade * 5.00;
			System.out.printf("Voce comeu %.0f x-bacon . O valor a pagar e %.2f", quantidade, x_Bacon);
		} else if (codigo == 4) {
			torradaSimples = quantidade * 2.00;
			System.out.printf("Voce comeu %.0f torrada simples. O valor a pagar e %.2f", quantidade, torradaSimples);
		} else if (codigo == 5) {
			refrigerante = quantidade * 1.50;
			System.out.printf("Voce tomou %.0f refrigerante. O valor a pagar e %.2f", quantidade, refrigerante);
		} else {
			System.out.println("Invalido");
		}
		sc.close();
	}
}
