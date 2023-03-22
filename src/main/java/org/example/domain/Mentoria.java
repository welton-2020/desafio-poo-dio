package org.example.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Objects;


@Entity
public class Mentoria extends Conteudo {

    private LocalDate data;


    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                " titulo= '" + getTitulo() + '\'' +
                ", descricao= '" + getDescricao() + '\'' +
                ", dataDaMentoria= " + data +
                '}';
    }
}
