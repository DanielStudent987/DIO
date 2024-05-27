package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate cargaMentoria;

    public Mentoria(String titulo, String descricao, LocalDate cargaMentoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaMentoria = cargaMentoria;
    }
    
    //SETTERS AND GETTERS
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
    public LocalDate getCargaMentoria() {
        return cargaMentoria;
    }
    public void setCargaMentoria(LocalDate cargaMentoria) {
        this.cargaMentoria = cargaMentoria;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", cargaMentoria=" + cargaMentoria + "]";
    }

    
}
