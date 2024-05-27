package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate cargaMentoria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String titulo, String descricao, LocalDate cargaMentoria) {
        setDescricao(descricao);
        setTitulo(titulo);
        this.cargaMentoria = cargaMentoria;
    }

    //SETTERS AND GETTERS
    public LocalDate getCargaMentoria() {
        return cargaMentoria;
    }
    public void setCargaMentoria(LocalDate cargaMentoria) {
        this.cargaMentoria = cargaMentoria;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaMentoria=" + cargaMentoria + "]";
    }

    
}
