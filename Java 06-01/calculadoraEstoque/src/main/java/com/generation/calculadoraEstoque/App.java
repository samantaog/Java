package com.generation.calculadoraEstoque;

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
    	
        System.out.println( "Digite a quantidade mínima: " );
        int min = entrada.nextInt();
        System.out.println( "Digite a quantidade máxima: " );
        int max = entrada.nextInt();
        
       int estoqueMedio = (min + max )/2;
       System.out.println( "O estoque médio é: " + estoqueMedio);
       
    }
}
