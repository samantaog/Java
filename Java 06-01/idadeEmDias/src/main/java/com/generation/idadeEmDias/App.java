package com.generation.idadeEmDias;

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
    	
        System.out.println( "Digite os anos: ");
        int anos = entrada.nextInt();
        System.out.println( "Digite os meses: ");
        int meses = entrada.nextInt();
        System.out.println( "Digite os dias: ");
        int dias = entrada.nextInt();
        
        double transformacaoAno = (365 * anos);
        double transformacaoMeses = (30 * meses);
        double idadeEmDias = (transformacaoAno + transformacaoMeses + dias);
     
       System.out.println( "Idade total em dias: " + idadeEmDias);
    }
}
