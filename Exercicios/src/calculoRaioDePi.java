import java.util.Locale;
import java.util.Scanner;

public class calculoRaioDePi {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("Area igual a : %.4f ", area);
		
		sc.close();
	}

}
