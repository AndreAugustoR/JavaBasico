import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double tempo, velocidade, distancia, combsgasto;
		
		tempo = teclado.nextDouble();
		
		velocidade = teclado.nextDouble();
		
		distancia = tempo * velocidade;
		
		combsgasto = distancia / 12;
		
		System.out.printf("%.3f\n", combsgasto);
		
		teclado.close();
				
		
	}

}
