package org.example.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Bootcamp {

    private Long id;
    private String nome;
    private LocalDate dataInicial;
    private LocalDate dataFinal;

    public Bootcamp() { }

    public Bootcamp(Long id, String nome, LocalDate dataInicial, LocalDate dataFinal) {
        this.id = id;
        this.nome = nome;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp)) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(id, bootcamp.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                '}';
    }
}
