import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		int X;
		int Y;
		
		
		do {
			X = teclado.nextInt();
			Y = teclado.nextInt();
			
			
			if (X > 0 && Y > 0) {
				System.out.printf("primeiro\n");
			} else if (X < 0 && Y > 0) {
				System.out.printf("segundo\n");
			} else if (X < 0 && Y < 0) {
				System.out.printf("terceiro\n");
			} else if (X > 0 && Y < 0) {
				System.out.printf("quarto\n");
			}
		} while (X != 0 && Y != 0);
		
		teclado.close();
		
		
	}
}
