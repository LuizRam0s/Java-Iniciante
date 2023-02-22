import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int voto = sc.nextInt();
		
		while (voto != 4) {
			if (voto == 1) {
				alcool += 1;
				}else if (voto == 2) {
					gasolina += 1;
					}else if (voto == 3) {
						diesel += 1;
						}else {
							System.out.println("Digite um numero valido!!");
						}
			voto = sc.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.printf("Alcool: %d %n", alcool);
		System.out.printf("Gasolina: %d %n", gasolina);
		System.out.printf("Diesel: %d %n", diesel);
		
		sc.close();
	}

}
