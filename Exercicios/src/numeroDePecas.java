import java.util.Locale;
import java.util.Scanner;

public class numeroDePecas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, peca1, peca2;
		double valorUnitario1, valorUnitario2;
		codigo1 = sc.nextInt();
		peca1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		codigo2 = sc.nextInt();
		peca2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		double valorTotal = peca1 * valorUnitario1 + peca2 * valorUnitario2;
		
		System.out.printf("Valor a pagar: %.2f ", valorTotal);
		sc.close();
	}

}
