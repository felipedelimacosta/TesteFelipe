package com.felipe.teste.repository;

import com.felipe.teste.model.Vendedor;

import org.springframework.data.repository.CrudRepository;

public interface VendedorRepository extends CrudRepository<Vendedor, Integer>{
    
    public Vendedor findByCpf(String cpf);

}