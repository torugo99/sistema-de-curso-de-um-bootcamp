package edu.dio.desafio.domain;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo{

    private LocalDateTime data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {}
    
    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String toString() {
        return "\n Mentoria{" +
                "\n titulo=' " + getTitulo() + '\'' +
                ", \n descricao=' " + getDescricao() + '\'' +
                ", \n data=" + data +
                '}';
    }
}
