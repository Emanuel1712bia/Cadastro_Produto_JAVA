package com.emanuel.ProductAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @Column
    private String id;

    @Column
    private String nome;

    @Column
    private String descricaao;

    @Column
    private double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaao() {
        return descricaao;
    }

    public void setDescricaao(String descricaao) {
        this.descricaao = descricaao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricaao='" + descricaao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
