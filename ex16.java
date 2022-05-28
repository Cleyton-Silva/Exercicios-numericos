package exerciciossevage;
import java.util.*;
public class ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int n,v,i=1;
		int p = 0;
		int I = 0;
		
		System.out.println(" quantidade de valores que ira ser lida  " );
		n = entrada.nextInt();
		
		
        do {
			
        	System.out.println(" digite valores seus valores " + i);
    		v = entrada.nextInt();
    		i++;
			
    		 if (v%2 == 0 && v > 0) {
           	  
    				
    			 System.out.println();
    				System.out.println("numero par e positivo " + v );
    				
    			}
    	          else if (v%2 == 1 && v > 0) {
    	        	  System.out.println();
    	        	  System.out.println("numero impar e positivo " + v );
    	        	  
    	        	  
    	          }
    	          
    	         else if (v%2 == 0 && v < 0) {
    	        	  
    	        	 System.out.println();
    	        	  System.out.println("numero par e negativo " + v );
    	          }
    	          
    	         else if (v%2 == 1 || v < 0 ) {
    	        	 
    	        	 System.out.println();
    	       	  
    	       	  System.out.println("numero impar e negativo " + v );
    	       	  
    	         }else {
    	        	 
    	        	 System.out.println();
    	        	 System.out.println("NULO");
    	        	 
    		}
			
			
		} while (i <= n );
        
         
	
	}
	
}

