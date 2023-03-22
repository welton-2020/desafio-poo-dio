package org.example.domain;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;

@Setter
@Getter
@Entity
public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso() {  }

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

    @Override
    public String toString() {
        return "{" +
                " titulo= '" + getTitulo() + '\'' +
                ", descricao= '" + getDescricao() + '\'' +
                ", cargaHoraria= " + cargaHoraria +
                '}';
    }
}
