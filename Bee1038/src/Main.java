import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			
			int cod, quant;
			
			double valor;
			
			cod = teclado.nextInt();
			
			quant = teclado.nextInt();		
			
			
			if (cod == 1) {
				
				valor = 4.00 * quant;
			}
			else if (cod == 2) {
				
				valor = 4.50 * quant;
			}
			else if (cod == 3) {
				
				valor = 5.0 * quant;
			}
			else if (cod == 4) {
				
				valor = 2.0 * quant;
			}
			else {
				
				valor = 1.50 * quant;
			}
			
			System.out.printf("Total: R$ %.2f\n", valor);
			
			teclado.close();
			
			
		}
}
