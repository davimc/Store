package io.github.davimc.Store.dto;

import io.github.davimc.Store.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class ProductDTO implements Serializable {
    private final static long serialVersionUID = 1L;

    private Long id;

    private String titulo;
    private String descricao;

    private Double valor;
    private String categoria;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String titulo, String descricao, Double valor, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public ProductDTO(Product obj) {
        this.id = obj.getId();
        this.titulo = obj.getTitulo();
        this.descricao = obj.getDescricao();
        this.valor = obj.getValor();
        this.categoria = obj.getCategoria();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
