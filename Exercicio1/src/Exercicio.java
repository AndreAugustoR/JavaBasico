import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double salarioliq, valorhoratrab, quanthoras, percinss, salariobrut;
		
		System.out.println("Digite o valor da hora trabalhada:");
		valorhoratrab = teclado.nextDouble();
		
		System.out.println("Digite a quantidade de horas:");
		quanthoras = teclado.nextDouble();
	
		System.out.println("Digite a porcentagem de desconto do INSS:");
		percinss = teclado.nextDouble();
		
		salariobrut = valorhoratrab * quanthoras;
		
		salarioliq = salariobrut - (salariobrut * (percinss / 100));
		
		System.out.println("O valor do salario liquido é: " + salarioliq );
		
		teclado.close();

	}

}
