package com.generation.relacionamentoNumeros;

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
    	
        System.out.println( "Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.println( "Digite o segundo número: ");
        int num2 = entrada.nextInt();
        
        boolean maior = false, menor = false, maiorIgual= false, menorIgual = false, igual = false, diferente = false;
        
        if (num1 == num2) igual = true;
        System.out.println("igual " + igual);
        
        if (num1 > num2) maior = true;
        System.out.println("maior " + maior);
        
        if (num1 < num2) menor = true;
        System.out.println("menor " + menor);
        
        if (num1 != num2) diferente = true;
        System.out.println("diferente " + diferente);
        
        if (num1 >= num2) maiorIgual = true;
        System.out.println("maior ou igual  " + maiorIgual);
        
        if (num1 <= num2) menorIgual = true;
        System.out.println("menor ou igual  " + menorIgual);
               
    }
}
