import java.util.Locale;
import java.util.Scanner;

public class exercicos07 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A, B;
		A = sc.nextFloat();
		B = sc.nextFloat();
		
		if (A == 0.0 && B ==0.0) {
			System.out.println("Na origem");
		}else if (A > 0.0 && B < 0.0) {
			System.out.println("Q4");
			}else if(A < 0.0 && B < 0.0) {
				System.out.println("Q3");
				}else if (A < 0.0 && B > 0) {
					System.out.println("Q2");
					}else if(A > 0.0 && B > 0) {
						System.out.println("Q1");
						}else {
							
						}
		sc.close();
	}

}
