package com.generation.Exercicio1;

public class Socios {
	class Socio {
		public String nome;
		 String endereco;
		 double cpf;
		 double rg;
		 double telefone;
		 double dataNascimento;
		
		
			
		public Socio (String nome, String endereco, double cpf, double rg, double telefone, double dataNascimento) {
			this.nome = nome;
			this.endereco = endereco;
			this.cpf = cpf;
			this.rg = rg;
			this.telefone = telefone;
			this.dataNascimento = dataNascimento;
			
		}

			
		
	}
	
	
	

	public String nome;
	public String endereco;
	public double cpf;
	public double rg;
	public int telefone;
	private char[] dataNascimento;
	public void comprarAcoes() {
		System.out.println("O Nome do sócio é " + this.nome);
		System.out.println("O CPF do sócio é " + this.cpf);
		System.out.println("O RG do sócio é " + this.rg);
		System.out.println("O telefone do sócio é " + this.telefone);
		System.out.println("O endereço do sócio é " + this.endereco);
		System.out.println(" A data de nascimento do sócio é " + this.dataNascimento);
		
	}

}
