package io.github.davimc.Store.dto;

import io.github.davimc.Store.entities.Product;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class ProductUpdateDTO implements Serializable {
    private final static long serialVersionUID = 1L;

    @Size(min = 2, message = "Título precisa ter o tamanho mínimo de 2")
    private String titulo;
    private String descricao;

    private Double valor;

    private String categoria;

    public ProductUpdateDTO() {
    }

    public ProductUpdateDTO(String titulo, String descricao, Double valor, String categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public ProductUpdateDTO(Product obj) {
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

    public Product toModel(Product obj) {

        obj.setTitulo(titulo == null? obj.getTitulo() : titulo);
        obj.setDescricao(descricao == null? obj.getDescricao() : descricao);
        obj.setValor(valor == null? obj.getValor() : valor);
        obj.setCategoria(categoria == null? obj.getCategoria() : categoria);

        return obj;
    }
}
