import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idadetotal, idadeano, idademes, idadedia;
		
		idadetotal = teclado.nextInt();
		
		idadeano = idadetotal / 365;
		
		System.out.println(idadeano + " ano(s)");
		
		idademes = (idadetotal % 365) / 30;
		
		System.out.println(idademes + " mes(es)");
		
		idadedia = (idadetotal % 365) % 30;
				
		System.out.println( idadedia + " dia(s)");	
		
		teclado.close();
		
		
	}

}
