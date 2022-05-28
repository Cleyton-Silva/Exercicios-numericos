package exerciciossevage;
import java.util.*;
public class ex20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
	
		int n=0,v,i=1;
		int soma;
		int subtraçao = 0;
		int saldo;
		
		boolean validador = true;
		
		
        do {
			
        	System.out.println("  Digite a operaçao 1 para depositar , 2 para sacar e 3 para encerrar a operaçao  ");
    		v = entrada.nextInt();
    		i++;
			
    		 if (v == 1) {
           	  
    				
    			 System.out.println();
    				System.out.println("Qual valor do deposito " );
    				soma = entrada.nextInt();
    				n = n + soma;
    				
    			}
    	          else if (v == 2) {
    	        	  System.out.println();
    	        	  System.out.println("Qual valor de saque " );
    	        	  subtraçao = entrada.nextInt();
    	        	  n = n - subtraçao;
    	        	  
    	          }
    	          
    	         else if (v == 3) {
    	        	  
    	        	 System.out.println();
    	        	  System.out.println("Operaçao encerrada " );
    	        	  validador = false;
    	          }
 
			
			
		} while (validador );
        
        if (n > 0) {
        
		System.out.println(" CONTA PREFERENCIAL  ");
        }
        
        else if (n < 0) {
        	
        	System.out.println("CONTA ESTOURADA  ");
        	
        }
        
	else {
		
		System.out.println(" CONTA ZERADA");
		
	}
	
}

}