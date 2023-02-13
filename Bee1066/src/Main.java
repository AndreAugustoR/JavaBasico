import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
		
		int contPar = 0;
        int contImpar = 0;
        int contP = 0;
        int contN = 0;
        int x;
        
        
        for (int i = 0; i < 5; i++) {
        	x = teclado.nextInt();
        	if (x % 2 == 0) contPar++;
        	else contImpar++;
        	if (x > 0) contP++;
        	else if(x < 0) contN++;
        }
        
        
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contP + " valor(es) positivo(s)");
        System.out.println(contN + " valor(es) negativo(s)");
	
        
        teclado.close();
	
	
	}
	
	

}
