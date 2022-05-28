package exerciciossevage;
import java.util.*;
public class ex15 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	
     int n,i,s;
	
	System.out.println(" Digite o valor de N ");
	n = entrada.nextInt();
	
	for( i = 0;i < n;){
		
		s =  n * (n - i);
		i++;
		System.out.println(s);
	
	
	}
	
	
}

}
