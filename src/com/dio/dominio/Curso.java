package com.dio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(String titulo, int cargaHoraria) {
        super(titulo);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
