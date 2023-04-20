import java.util.Locale;
import java.util.Scanner;

public class medidas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaq, area_tri, area_trap; 
		
		System.out.print("Digite a medida A: ");
		a = sc.nextDouble();
		
		System.out.print("Digite a medida B: ");
		b = sc.nextDouble();
		
		System.out.print("Digite a media C: ");
		c = sc.nextDouble();
		
		areaq = a * a;
		System.out.printf("AREA DO QUADRADO: %.4f\n", areaq);
		
		area_tri = (a*b)/2;
		System.out.printf("AREA DO TRIANGULO: %.4f\n", area_tri);
		
		area_trap = ((a+b)*c)/2;
		System.out.printf("AREA DO TRAPEZIO: %.4f\n", area_trap);
		
		sc.close();
	}

}
