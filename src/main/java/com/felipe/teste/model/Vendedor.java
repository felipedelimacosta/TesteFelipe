package com.felipe.teste.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Vendedor {

    @Id
    private int id;

    private String nome;
    private String cpf; //Pode modificar
    private int telefone;
    private String endereco;
    private String trabalho;
    
    @OneToMany
    @JoinColumn(name = "pessoaFisica_id")
    private List<PessoaFisica> pessoaFisica;


    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return String return the trabalho
     */
    public String getTrabalho() {
        return trabalho;
    }

    /**
     * @param trabalho the trabalho to set
     */
    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

}
