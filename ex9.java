package exerciciossevage;

import java.util.*;

public class ex9 {
    public static void main(String[] args) {
    	Scanner entrada = new Scanner (System.in);
    	
		int media=0,notas;
		int j,i=1;
		
		
		System.out.println("quantidades de alunos na classe ");
		j = entrada.nextInt();
		if (j >= 11) {
			System.out.println("nota invalida ");
		}
		
		do {
			
			System.out.println(" digite a nota do aluno  " + i);
			notas = entrada.nextInt();
			
			
			i++;
			
		} while (i < j );
		
		if (notas > media) {
			
			media = notas;
			System.out.println("média da classe " + media );
			
		}
		
	}

	
	
}
