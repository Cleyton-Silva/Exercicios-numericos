package exerciciossevage;

import java.util.*;

public class ex2 {


	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
		int valor = 1;
		int n,i=0;
		
		System.out.println("Digite o valor de N " );
		n = entrada.nextInt();
		
		
		
		while (valor <= n) {
			
			i += valor;
			valor++;
		System.out.println( "  " + i );
		
		
		}
		
		
	}
	
}
	

