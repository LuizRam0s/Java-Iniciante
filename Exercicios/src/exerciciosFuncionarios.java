import java.util.Locale;
import java.util.Scanner;

public class exerciciosFuncionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		double horasTrabalhadas, horaSalarioFuncionario, salario;
		 horasTrabalhadas = sc.nextDouble();
		 horaSalarioFuncionario = sc.nextDouble();
		 salario = horasTrabalhadas * horaSalarioFuncionario;
		 
		 System.out.printf("Number = %d %n", numeroFuncionario);
		 System.out.printf("Salario = R$%.2f", salario);
		 
		 sc.close();

	}

}
