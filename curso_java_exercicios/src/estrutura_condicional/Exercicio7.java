package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		double x = sc.nextDouble();
		
		System.out.print("Digite o valor de Y: ");
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");	
		}
		else if (x >= 0 && y >=0) {
			System.out.println("Q1");			
		}
		else if (y >= 0 && x < 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y <0) {
			System.out.println("Q3");
		}
		else if (x >=0 && y < 0) {
			System.out.println("Q4");
		}
		
		sc.close();		
	}

}
