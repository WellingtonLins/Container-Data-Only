package br.edu.ifpb.model;

import java.io.Serializable;

public class Autor implements Serializable{

    private int codigo;
    private String nome;
    private String email;
    private String cpf;

    public Autor() {
    }

    public Autor(int codigo, String nome, String email, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}