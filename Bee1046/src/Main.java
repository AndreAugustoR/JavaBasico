import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int inicioh, fimh, durh; 
		
		inicioh = teclado.nextInt();
		fimh = teclado.nextInt();
	
		if (inicioh > fimh) {
			
			fimh = fimh + 24;
			durh = fimh - inicioh;
		}
		else if ( fimh == inicioh) {
			
			durh = 24;
		}
		else {
			
			durh = fimh - inicioh;
		}
		
		
		System.out.println("O JOGO DUROU " + durh + " HORA(S)");
		
		
		teclado.close();
		
	}

}
