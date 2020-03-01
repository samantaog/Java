package com.generation.primeiroPrograma;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	
    	Scanner sn = new Scanner(System.in);
        System.out.println( "Digite sua idade" );
        int minhaIdade = sn.nextInt();
        System.out.println("Sua idade é: " + minhaIdade);
        
        Scanner sn1 = new Scanner(System.in);
        System.out.println( "Digite a idade da sua mãe" );
        int idadeMae = sn1.nextInt();
        System.out.println("A idade da sua mãe é: " + idadeMae);
        
       
        int diferencaIdade = idadeMae - minhaIdade;       
        System.out.println("Minha mãe é mais velha do eu: " + diferencaIdade);
        
    }
}
