package org.example.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Objects;

@Setter
@Getter
@Entity
public class Devs {

    private Long id;
    private String nome;

    private double xp;
    private Mentorias mentorias;
    private AtividadesCursos atividades;

    public Devs() {
    }

    public Devs(Long id, String nome,double xp, Mentorias mentorias, AtividadesCursos atividades) {
        this.id = id;
        this.nome = nome;
        this.xp = xp;
        this.mentorias = mentorias;
        this.atividades = atividades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Devs)) return false;
        Devs devs = (Devs) o;
        return getId().equals(devs.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Devs{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", xp=" + xp +
                ", mentorias=" + mentorias +
                ", atividades='" + atividades + '\'' +
                '}';
    }

    // Metodos a sere realizados
    /*
     * Inscrever no Bootcamp
     * Progredir
     * Calcular Total XP
     * Exibir Cursos
     */
}
