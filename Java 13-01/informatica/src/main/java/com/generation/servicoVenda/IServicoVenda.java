package com.generation.servicoVenda;

import com.generation.model.Produto;
import com.generation.modelCliente.Cliente;

public interface IServicoVenda {
	String Venda(Produto pc, Cliente cliente);

	String CancelarVenda(Produto pc, Cliente cliente);

}
