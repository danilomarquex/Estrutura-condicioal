import java.util.Locale;
import java.util.Scanner;

public class aula02_07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//lendo vários dados na mesma linha
		String x;
		String s;
		int y;
		double z;
		
		x = sc.next(); //lendo uma palavra
		y = sc.nextInt(); //lendo um numero inteiro
		z = sc.nextDouble(); //lendo um numero ponto flutuante
		sc.nextLine();
		s = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(s);
		
		
		sc.close();
	}

}
