package exerciciossevage;
import java.util.*;
public class ex19 {

	public static void main(String[] args) {
	
    Scanner entrada = new Scanner (System.in);

    String senha;

    int cont = 0;


    boolean validador = false;

    do {
        System.out.println("Digite a senha: ");
        senha = entrada.next();

        if (senha.equals("2002")) {
            System.out.println("Acesso permitido");
            cont++;
            break;
        }else {
            System.out.println("Senha Invalida!");
            validador = true;
        }

    }
    while (validador = true);

}

}
	
	
