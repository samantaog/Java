package com.generation.login;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner entrada = new Scanner(System.in);
    	
        System.out.println( "Informe seu login: " );
        String login = entrada.nextLine();
        System.out.println( "Informe sua senha: " );
        int senha = entrada.nextInt();
        
        if (login.equals("email@email.com") && senha == 1234) {
        	System.out.println( "Usuário logado com sucesso");
        }else {
        	System.out.println( "Usuário e/ou senha incorreto");
        }
    }
}
