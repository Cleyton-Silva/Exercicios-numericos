package exerciciossevage;
import java.util.*;
public class ex20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
	
		int n=0,v,i=1;
		int soma;
		int subtra�ao = 0;
		int saldo;
		
		boolean validador = true;
		
		
        do {
			
        	System.out.println("  Digite a opera�ao 1 para depositar , 2 para sacar e 3 para encerrar a opera�ao  ");
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
    	        	  subtra�ao = entrada.nextInt();
    	        	  n = n - subtra�ao;
    	        	  
    	          }
    	          
    	         else if (v == 3) {
    	        	  
    	        	 System.out.println();
    	        	  System.out.println("Opera�ao encerrada " );
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