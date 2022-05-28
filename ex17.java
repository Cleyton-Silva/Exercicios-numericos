package exerciciossevage;
import java.util.*;
public class ex17 {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
    int i,n ;
	
    System.out.println("Declare um numero para saber seus divisores ");
    n = entrada.nextInt();
	
	for( i = n;i > 0 ;i = i - 1){
	
		if ( n%i == 0 ){
		
		System.out.println(i);
	}
	
	
	
}

}

}