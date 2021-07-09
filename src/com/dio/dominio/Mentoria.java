package com.dio.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {
    private LocalDateTime data;

    public Mentoria(String titulo, LocalDateTime data) {
        super(titulo);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
