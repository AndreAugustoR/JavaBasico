import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int inicioh, iniciom, fimh, fimm, durh, durm; 
		
		inicioh = teclado.nextInt();
		iniciom = teclado.nextInt();
		fimh = teclado.nextInt();
		fimm = teclado.nextInt();
		
if (fimh > inicioh && fimm > iniciom) {
			
			durh = fimh - inicioh;
			durm = fimm - iniciom;	
		}
		else if (fimh < inicioh && fimm > iniciom) {
			
			durh = 24 - (inicioh - fimh);
			durm = fimm - iniciom;
		}
		else if (fimh < inicioh && fimm < iniciom) {
			
			durh = 24 - (inicioh - fimh);
			durm = 60 - (iniciom - fimm);
		}
		else if (fimh > inicioh && fimm < iniciom) {
	
			durh = fimh - inicioh;
			durm = 60 - (iniciom - fimm);
		}
		else if (fimh == inicioh && fimm > iniciom) {
	
			durh = 0;
			durm = fimm - iniciom;
		}
		else if (fimh == inicioh && fimm < iniciom) {
	
			durh = 0;
			durm = 60 - (iniciom - fimm);
		}
		else if (fimh > inicioh && fimm == iniciom) {
			
			durh = fimh + inicioh;
			durm = 0;
		}
		else if (fimh < inicioh && fimm == iniciom) {
	
			durh = 24 - (inicioh - fimh);
			durm = 0;
		}
		else {
	
			durh = 24;
			durm = 0;
		}
		
		
		
		
		System.out.println("O JOGO DUROU " + durh + " HORA(S) E " + durm + " MINUTO(S)");
		
		
		teclado.close();
		
	}

}
