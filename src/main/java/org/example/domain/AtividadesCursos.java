package org.example.domain;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;

@Setter
@Getter
@Entity
public class AtividadesCursos {

    private Long id;
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    private double xp;

    public AtividadesCursos() { }

    public AtividadesCursos(Long id, String titulo, String descricao, int cargaHoraria, double xp) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.xp = xp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtividadesCursos)) return false;

        AtividadesCursos that = (AtividadesCursos) o;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String toString() {
        return "AtividadesCursos{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", xp=" + xp +
                '}';
    }

    // Metodos a serem add
    /*
     * Calcular XP
     */
}
