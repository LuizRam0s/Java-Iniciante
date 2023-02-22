import java.util.Locale;
import java.util.Scanner;

public class exercicos01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero.");
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("O numero e positivo");
		} else {
			System.out.println("O numero e negativo");
		}
		
		sc.close();
	}

}
