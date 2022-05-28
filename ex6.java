package exerciciossevage;

import java.util.*;

public class ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int idade,i = 1, j = 5;
		int maioridade=0;
		String nome;
		String genero;
		
		
		
		
		do {
			
			System.out.println(" qual o nome do aluno ? " + i);
			nome = entrada.next();
			
			System.out.println(" qual o genero do aluno ? " + i );
			genero = entrada.next();
			
			System.out.println(" qual a idade do aluno ? " + i );
			idade = entrada.nextInt();
			
			i++;
			
		} while (i < j );
		
		if (idade > maioridade) {
			
			maioridade = idade;
			System.out.println("aluno mais velho " + maioridade );
			
		}
	}
	
	
	
}
