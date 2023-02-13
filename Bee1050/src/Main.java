import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int d1, d2, d3, d4, d5, d6, d7, d8, ddd;
		
		d1 = 61;
		d2 = 71;
		d3 = 11;
		d4 = 21;
		d5 = 32;
		d6 = 19;
		d7 = 27;
		d8 = 31;
		
		ddd = teclado.nextInt();
		
		if (ddd == d1) {
			
			System.out.println("Brasilia");
		}
		else if (ddd == d2) {
			
			System.out.println("Salvador");
		}
		else if (ddd == d3) {
			
			System.out.println("Sao Paulo");
		}
		else if (ddd == d4) {
	
			System.out.println("Rio de Janeiro");
		}
		else if (ddd == d5) {
	
			System.out.println("Juiz de Fora");
		}
		else if (ddd == d6) {
	
			System.out.println("Campinas");
		}
		else if (ddd == d7) {
			
			System.out.println("Vitoria");
		}
		else if (ddd == d8) {
	
			System.out.println("Belo Horizonte");
		}
		else {
			
			System.out.println("DDD nao cadastrado");
		}
		
		teclado.close();
		
		
	}

}
