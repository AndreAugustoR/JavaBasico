import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int inicioh, iniciom, fimh, fimm; 
		
		inicioh = teclado.nextInt();
		iniciom = teclado.nextInt();
		fimh = teclado.nextInt();
		fimm = teclado.nextInt();
		
		int tempoi = inicioh * 60 + iniciom;
		int tempof = fimh * 60 + fimm;
		
		int duracao = tempof - tempoi;
		
		if (duracao <= 0) {
			
			duracao = duracao + 24 * 60;
		}
		
		int durh = duracao / 60;
		int durm = duracao % 60;
		
		
		
		System.out.println("O JOGO DUROU " + durh + " HORA(S) E " + durm + " MINUTO(S)");
		
		
		teclado.close();
		
	}

}
