package exerciciossevage;
import java.util.*;
public class ex20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
	
		int n=0,v,i=1;
		int soma;
		int subtrašao = 0;
		int saldo;
		
		boolean validador = true;
		
		
        do {
			
        	System.out.println("  Digite a operašao 1 para depositar , 2 para sacar e 3 para encerrar a operašao  ");
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
    	        	  subtrašao = entrada.nextInt();
    	        	  n = n - subtrašao;
    	        	  
    	          }
    	          
    	         else if (v == 3) {
    	        	  
    	        	 System.out.println();
    	        	  System.out.println("Operašao encerrada " );
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