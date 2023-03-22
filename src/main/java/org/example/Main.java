package org.example;

import org.example.domain.Bootcamp;
import org.example.domain.Curso;
import org.example.domain.Dev;
import org.example.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre Java");
        mentoria.setData(LocalDate.now());

//        System.out.println("Curso: " + curso1);
//        System.out.println("Curso: " + curso2);
//        System.out.println("Mentoria: " + mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Jav Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWelton = new Dev();
        devWelton.setNome("Welton");
        System.out.println("Dev: " + devWelton.getNome());
        devWelton.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos: "+ devWelton.getConteudosInscritos());
        devWelton.progredir();
        devWelton.progredir();
        System.out.println("Conteudos Concluidos: "+ devWelton.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos: "+ devWelton.getConteudosInscritos());
        System.out.println("XP: " + devWelton.calcularTotalXp());

        System.out.println("-----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdo Concluidos: "+ devJoao.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos: "+ devJoao.getConteudosInscritos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

    }
}