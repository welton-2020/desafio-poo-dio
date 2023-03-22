package org.example.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Objects;

@Setter
@Getter
@Entity
public class Mentorias {

    private Long id;
    private String descricao;
    private double xp;
    private LocalDate dataDaMentoria;

    public Mentorias() {    }

    public Mentorias(Long id, String descricao, double xp,LocalDate dataDaMentoria) {
        this.id = id;
        this.descricao = descricao;
        this.xp = xp;
        this.dataDaMentoria = dataDaMentoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mentorias)) return false;
        Mentorias mentorias = (Mentorias) o;
        return Objects.equals(getId(), mentorias.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", xp=" + xp +
                ", dataDaMentoria=" + dataDaMentoria +
                '}';
    }

    // Metodos a serem add
    /*
     * Calcular XP
     */
}
