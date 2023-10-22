package com.dio.diospringproject.service;


import com.dio.diospringproject.model.Vendedor;

public interface VendedorService {

	Iterable<Vendedor> buscarTodos();

	Vendedor buscarPorId(Long id);

	void inserir(Vendedor vendedor);

	void atualizar(Long id, Vendedor vendedor);

	void deletar(Long id);

}