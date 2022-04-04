package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio2_for {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos n�meros quer digitar?: ");
		int N = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i=0; i<N; i++) {
			System.out.print("Digite o n�mero: ");
			int x = sc.nextInt();
			
			if (x >=10 && x<=20) {
				in += 1;
			}
			else
				out +=1;
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}

}
