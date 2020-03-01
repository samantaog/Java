package com.generation.calculadoraDolar;

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
    	
        System.out.println( "Digite a cotação do dólar: " );
        float cotacaoDolar = entrada.nextFloat();
        System.out.println( "Digite o valor do dólar: " );
        float valorDolar = entrada.nextFloat();
        
       float valorEmReais = cotacaoDolar * valorDolar;
       System.out.println( "O valor em reais é: " + valorEmReais);
       
    }
}
