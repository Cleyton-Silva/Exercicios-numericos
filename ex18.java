package exerciciossevage;
import java.util.*;
public class ex18 {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
		 
    int n1 = 0, n2 = 1, n;
    int qtd;

    System.out.println("Digite a quantidade de termos: ");
    n = entrada.nextInt();

    
    
    for (qtd = n; qtd > 0; qtd--) {
    	if (n < 46) {
    	
    	
        System.out.print(n1 + " " );
        int n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
    	}
        
    }System.out.println("tem que ser menor que 46 " );
    
    

}

}

