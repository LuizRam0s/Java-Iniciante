import java.util.Locale;
import java.util.Scanner;

public class exercico02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("O numero %d e par", numero);
		} else {
			System.out.printf("O numero %d e impar", numero);
		}
		
		sc.close();
	}

}
