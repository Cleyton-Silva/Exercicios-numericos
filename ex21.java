package exerciciossevage;
import java.util.*;
public class ex21 {
public static void main(String[] args) {
	

	Scanner scanner = new Scanner(System.in);
    int numero, soma = 0;

    System.out.println("Digite um número:");
    numero = scanner.nextInt();

    for (int i = numero - 1; i > 0; i--) 
    {
        if(numero % i == 0) {
            soma += i;
        }
    }

    if(soma == numero) {
        System.out.println("É perfeito");
    } else {
        System.out.println("Não é perfeito");
    }

    scanner.close();
}
}
	
	
	

