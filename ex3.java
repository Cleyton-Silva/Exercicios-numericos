package exerciciossevage;
import java.util.*;
public class ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
		
		int n,i;
		int maior=0;
		
		
		
		for(i = 0; i <= 10; i++){
			System.out.println("Digite o item " + i);
			n = entrada.nextInt();
			if(n > maior){
			
			maior =  n ;
			
			
			}
			
			
			System.out.println("maior valor " + maior);
			
			}
    			
	}
}

	
	
	

	

