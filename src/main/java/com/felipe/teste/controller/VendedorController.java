package com.felipe.teste.controller;

import java.util.Optional;

import com.felipe.teste.model.Vendedor;
import com.felipe.teste.repository.VendedorRepository;

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
@RequestMapping(value = "vendedor")
public class VendedorController {
    
    @Autowired
    private VendedorRepository vendedorRepository;

    @PostMapping(value = "/criar")
    public ResponseEntity<Vendedor> CadastrarPessoa(@RequestBody Vendedor vendedor){
        vendedorRepository.save(vendedor);

        return ResponseEntity.ok().body(vendedor);

    }


    @GetMapping(value = "/pesquisar")
    public ResponseEntity<Vendedor> pesquisarPessoaFisica(@RequestBody String cpf){
        Vendedor vendedor =  vendedorRepository.findByCpf(cpf);

        return ResponseEntity.ok().body(vendedor);
    }

    @PutMapping(value = "/editar")
    public ResponseEntity<Optional<Vendedor>> editarPessoaFisica(@RequestBody Vendedor vendedor){
        Optional<Vendedor> novoVendedor = vendedorRepository.findById(vendedor.getId());
        novoVendedor.get().setEndereco(vendedor.getEndereco());
        novoVendedor.get().setNome(vendedor.getNome());
        novoVendedor.get().setTelefone(vendedor.getTelefone());

        return ResponseEntity.ok().body(novoVendedor);
    }

    @DeleteMapping(value = "/detelar")
    public BodyBuilder deletarPessoaFisica(@RequestBody Vendedor vendedor){
        vendedorRepository.delete(vendedor);

        return ResponseEntity.ok();
    }

}