import java.util.Locale;
import java.util.Scanner;

public class exercicios06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextInt();
		
		if(valor >= 0 && valor <= 25) {
			System.out.printf("O intervalo e de 0 a 25");
			} else if (valor >= 26 && valor <=50) {
				System.out.printf("O intervalo e de 26 a 50 ");
				} else if (valor >= 51 && valor <=75 ) {
					System.out.printf("O intervalo e de 51 a 75");
					}else if (valor >= 76 && valor <= 100) {
						System.out.printf("O intervalo e de 76 a 100");
						} else {
							System.out.println("Numero invalido");
						}
		sc.close();
	}

}
