package com.generation.Exercicio1;

import com.generation.Exercicio1.Socios.Socio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
     Socios socio1 = new Socios ();
     	socio1.nome = "Thiago";
     	socio1.endereco = "rua bla bla bla";
     	socio1.cpf = 1212.121122;
     	socio1.rg = 222.333;
     	socio1.telefone = 892892828;
     	socio1.comprarAcoes ();
     	
     Socios socio2 = new Socios ();
     	socio2.nome = "Marcos";
     	socio2.endereco = "rua bla bla bla";
     	socio2.cpf = 3333.555;
     	socio2.rg = 9999.555;
     	socio2.telefone = 00000;
     	socio2.comprarAcoes ();
  	
     Socios socio3 = new Socios ();
     	socio3.nome = "Vitor";
     	socio3.endereco = "rua bla bla bla";
     	socio3.cpf = 11111.111;
     	socio3.rg = 222.222;
     	socio3.telefone = 066666666;
     	socio3.comprarAcoes ();
  	
     
     
    }
}
