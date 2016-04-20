package login_teste;

import java.util.Scanner;

/**
 * 
 * @author Manoel
 *
 */

public class Login {

	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Login: ");
		String login = entrada.nextLine();
		
		System.out.print("Senha: ");
		int senha = entrada.nextInt();
		entrada.nextLine();
		
		if(!login.equals("neto"))
			System.out.println("Login Invalido");
		
		else if(senha != 123)
			System.out.println("Senha Invalida");
		
		else
			System.out.println("Voce esta logado!");
	}
	
}
