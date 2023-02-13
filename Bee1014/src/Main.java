import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double distkm, combsgasto, consumo;
		
		distkm = teclado.nextDouble();
		
		combsgasto = teclado.nextDouble();
		
	
		consumo = distkm / combsgasto;
		
		System.out.printf("%.3f km/l\n", consumo);
		
		teclado.close();
		
	
	}

}
