package com.generation.comissaoVendedor;

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
    	
        System.out.println( "Digite a identificação do vendedor: ");
        int identificacao = entrada.nextInt();
        System.out.println( "Digite o ID da peça: ");
        int idPeca = entrada.nextInt();
        System.out.println( "Digite o preço unitário da peça: ");
        float precoPeca = entrada.nextFloat();
        System.out.println( "Quantidade de peças vendidas: ");
        int quantidadeVendida = entrada.nextInt();
        
       double comissao = (precoPeca * quantidadeVendida) * 0.05;
     
       System.out.println( "O valor da comissão é: " + comissao);
    }
}
