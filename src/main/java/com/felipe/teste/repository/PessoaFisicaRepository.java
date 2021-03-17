package com.felipe.teste.repository;

import com.felipe.teste.model.PessoaFisica;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends CrudRepository<PessoaFisica, Integer> {
    
    public PessoaFisica findByCpf(String cpf);
}