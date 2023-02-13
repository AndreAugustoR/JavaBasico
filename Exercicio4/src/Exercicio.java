import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		nota1 = teclado.nextDouble();
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("Sua média é: " + media);
		
		
		
		if(media >= 6.0) {
			
			System.out.println("Parabéns, você foi aprovado!");
				
		}
		
		else {
			
			System.out.println("Você foi reprovado.");
			
			
		}
	
	}

}
