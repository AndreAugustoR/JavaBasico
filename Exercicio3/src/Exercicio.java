import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double salariomin, quantkw, valordesc, valorpago, valorkw;
		
		System.out.println("Digite o valor do salario minimo:");
		salariomin = teclado.nextDouble();
		
		System.out.println("Digite a quantidade de kw gasta:");
		quantkw = teclado.nextDouble();
		
		
		
		valorkw = salariomin / 700;
				
		
		
		valorpago = valorkw * quantkw;
		
		
		valordesc =	valorpago - (valorpago * 0.10);
		
		System.out.printf("O valor do kw é R$ %.2f\n", valorkw);
		
		System.out.printf("O valor pago é R$ %.2f\n", valorpago);
		
		System.out.printf("O valor pago com desconto é R$ %.2f", valordesc);
		
		teclado.close();
		

				
	}
}
