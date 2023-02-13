import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double tempogasto, velmedia, quantlitrosgastos, distancia;
	
		System.out.println("Digite o tempo gasto na viagem:");
		tempogasto = teclado.nextDouble();
		
		
		System.out.println("Digite a velocidade media:");
		velmedia = teclado.nextDouble();
		
		distancia = velmedia * tempogasto;
		
		quantlitrosgastos = distancia / 12;
		
		System.out.println("A quantidade de litros gastos foi: " + quantlitrosgastos);
		
		teclado.close();
		
		
	}

}
