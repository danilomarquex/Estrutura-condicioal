import java.util.Locale;
import java.util.Scanner;

public class ciruclo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double area;
		double pi = 3.14159;
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		
		area = pi * Math.pow(raio, 2.0);
		System.out.printf("AREA: %.3f", area);
		
		
		
		
		
		
		sc.close();
	}

}
