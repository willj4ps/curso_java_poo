package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		int B = sc.nextInt();
		
		if (A > B && A % B == 0) {
			System.out.println("S�O M�LTIPLOS");
		}
		else if (B > A && B % A == 0) {
			System.out.println("S�O M�LTIPLOS");
		}
		else {
			System.out.println("N�O S�O M�LTIPLOS");
		}
		
		sc.close();	
	}

}
