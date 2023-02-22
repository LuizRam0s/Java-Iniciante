import java.util.Locale;
import java.util.Scanner;

public class exercicoDeSoma {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int total = numero1 + numero2;
		
		System.out.printf("A soma dos numeros %d e %d e: %d", numero1, numero2, total);
		sc.close();
	}

}
