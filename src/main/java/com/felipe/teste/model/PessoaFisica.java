package com.felipe.teste.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PessoaFisica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String nome;
    private String cpf; //Pode modificar
    private int telefone;
    private String endereco;

    

    /**
     * @return int return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
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

}
