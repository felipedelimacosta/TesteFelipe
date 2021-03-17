package com.felipe.teste.controller;

import java.util.Optional;

import com.felipe.teste.model.PessoaFisica;
import com.felipe.teste.repository.PessoaFisicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoaFisica")
public class PessoaFisicaController {
    
    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;

    @PostMapping(value = "/criar")
    public ResponseEntity<PessoaFisica> CadastrarPessoa(@RequestBody PessoaFisica pessoaFisica){
        
        pessoaFisicaRepository.save(pessoaFisica);

        return ResponseEntity.ok().body(pessoaFisica);
    }


    @GetMapping(value = "/pesquisar")
    public ResponseEntity<PessoaFisica> pesquisarPessoaFisica(@RequestBody String cpf){
       PessoaFisica pessoaFisica =  pessoaFisicaRepository.findByCpf(cpf);

        return ResponseEntity.ok().body(pessoaFisica);
    }

    @PutMapping(value = "/editar")
    public ResponseEntity<Optional<PessoaFisica>> editarPessoaFisica(@RequestBody PessoaFisica pessoaFisica){
        Optional<PessoaFisica> novaPessoaFisica = pessoaFisicaRepository.findById(pessoaFisica.getId());
        novaPessoaFisica.get().setEndereco(pessoaFisica.getEndereco());
        novaPessoaFisica.get().setNome(pessoaFisica.getNome());
        novaPessoaFisica.get().setTelefone(pessoaFisica.getTelefone());

        return ResponseEntity.ok().body(novaPessoaFisica);
    }

    @DeleteMapping(value = "/detelar")
    public BodyBuilder deletarPessoaFisica(@RequestBody PessoaFisica pessoaFisica){
        pessoaFisicaRepository.delete(pessoaFisica);

        return ResponseEntity.ok();
    }

}

