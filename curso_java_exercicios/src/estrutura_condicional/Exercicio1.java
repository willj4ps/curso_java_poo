package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um n�mero: ");
		int numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("N�MERO POSITIVO");
		}
		else {
			System.out.println("N�MERO NEGATIVO");
		}
		
		sc.close();

	}

}
