package br.edu.ifpb.model;

import java.io.Serializable;
import java.util.List;

public class Livro implements Serializable {

    private String ISBN;
    private String descricao; 
    private String edicao;
    private String anoLancamento;
    private List<Autor> autor;
 
    public Livro() {
    }

    public Livro(String ISBN, String descricao, String edicao, String anoLancamento) {
        this.ISBN = ISBN;
        this.descricao = descricao;
        this.edicao = edicao;
        this.anoLancamento = anoLancamento;
    }
    
    public Livro(String ISBN, String descricao, String edicao, String anoLancamento, List<Autor> autor) {
        this.ISBN = ISBN;
        this.descricao = descricao;
        this.edicao = edicao;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }


}
