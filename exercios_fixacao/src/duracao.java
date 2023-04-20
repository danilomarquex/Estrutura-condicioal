import java.util.Locale;
import java.util.Scanner;

public class duracao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int duracao, horas, minutos, segundos, resto;
		
		System.out.print("Digite a duração em segundos: ");
		segundos = sc.nextInt();
		
		sc.close();
	}

}
