import java.util.Locale;
import java.util.Scanner;

public class pagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double valorhora, pagamento;
		int horatrabalh;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		valorhora = sc.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		horatrabalh = sc.nextInt();
		
		pagamento = valorhora * horatrabalh;
		System.out.printf("O pagamento para %s deve ser %.2f\n", nome, pagamento);
		
		sc.close();
	}

}
