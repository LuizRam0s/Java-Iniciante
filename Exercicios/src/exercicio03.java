import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if(numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.printf("Os numeros %d e %d, sao multiplos", numero1, numero2);
		} else {
			System.out.printf("Os numeros %d e %d, nao sao multiplos", numero1, numero2);
		}
		sc.close();

	}

}
