import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		nota1 = teclado.nextDouble();	
		nota2 = teclado.nextDouble();
		
		media = (nota1 * 3.5 + nota2 * 7.5) / 11.0;
		
		System.out.printf("MEDIA = %.5f\n", media);
		
		teclado.close();
		
		
	}

}
