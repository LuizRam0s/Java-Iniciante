import java.util.Locale;
import java.util.Scanner;

public class bricandoDeCalculos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C ;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double areaTriangulo = A * C/2;
		System.out.printf("Area do triangulo e: %.3f %n", areaTriangulo);
		
		double areaCirculo = 3.14159 * Math.pow(C, 2);
		System.out.printf("Area do circulo e: %.3f %n", areaCirculo);
		
		double areaTrapezio = ((A + B) * C)/2;
		System.out.printf("Area do trapezio e: %.3f %n", areaTrapezio);
		
		double areaQuadrado = B * B;
		System.out.printf("Area do quadrado e: %.3f %n", areaQuadrado);
		
		double areaRetangulo = A * B;
		System.out.printf("Area do retangulo e: %.3f %n", areaRetangulo);
								
		sc.close();
	}

}
