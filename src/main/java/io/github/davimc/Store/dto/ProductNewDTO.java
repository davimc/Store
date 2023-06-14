package io.github.davimc.Store.dto;

import io.github.davimc.Store.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class ProductNewDTO implements Serializable {
    private final static long serialVersionUID = 1L;

    @NotNull(message = "É necessário informar um título")
    @NotBlank(message = "É necessário informar um título")
    private String titulo;
    private String descricao;

    @NotNull(message = "É necessário informar um preço")
    private Double valor;

    @NotNull(message = "É necessário informar uma categoria")
    private String categoria;

    public ProductNewDTO() {
    }

    public ProductNewDTO(String titulo, String descricao, Double valor, String categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public ProductNewDTO(Product obj) {
        this.titulo = obj.getTitulo();
        this.descricao = obj.getDescricao();
        this.valor = obj.getValor();
        this.categoria = obj.getCategoria();
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

    public Product toModel() {
        Product obj = new Product();
        obj.setTitulo(titulo);
        obj.setDescricao(descricao);
        obj.setValor(valor);
        obj.setCategoria(categoria);

        return obj;
    }
}
