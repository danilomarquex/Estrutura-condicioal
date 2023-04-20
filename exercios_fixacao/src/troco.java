import java.util.Locale;
import java.util.Scanner;

public class troco {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, din, troco;
		int quant;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		quant = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		din = sc.nextDouble();
		
		troco = din - (preco * quant);
		System.out.printf("Troco: %.2f", troco);
		
		sc.close();
	}

}
