package com.generation.baseDados;

import com.generation.modelCliente.Cliente;

public class baseDadosCliente {
	private Cliente[] listaClientes;

	public baseDadosCliente() {
		
		listaClientes= new Cliente[3];

		listaClientes[0] = new Cliente("Pica Pau", "121.484-5", "rua kdkakshdj");
		listaClientes[1] = new Cliente("Pepeu", "121.484-5", "rua kdkakshdj");
		listaClientes[3] = new Cliente("Jubileu", "121.484-5", "rua kdkakshdj");
	}

	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}

}
