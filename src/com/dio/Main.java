package com.dio;

import com.dio.dominio.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Curso cursoJavaBasico = new Curso("Java Básico", 8);
        cursoJavaBasico.setDescricao("Aprenda os conceitos básicos sobre Java.");

        Curso cursoDotNet = new Curso("Java .NET", 8);
        cursoDotNet.setDescricao("Aprenda os conceitos básicos sobre C#.");

        Curso cursoJavaAvancado = new Curso("Java Avançado", 8);
        cursoJavaAvancado.setDescricao("Aprenda os conceitos avançados sobre Java.");

        Mentoria mentoria = new Mentoria("Aprendendo Orientação a Objetos com Java", LocalDateTime.now());
        mentoria.setDescricao("Imersão sobre os pilares da Orientação a Objetos.");

        Bootcamp bootcamp = new Bootcamp("GFT START #2 Java");
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(45));
        List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJavaBasico, cursoJavaAvancado, mentoria);
        bootcamp.setConteudos(conteudosBootcamp);

        Dev marcos = new Dev("Marcos");
        Dev felipao = new Dev("Felipão");
        Dev venilton = new Dev("Venilton");

        marcos.inscrever(cursoDotNet);
        marcos.inscrever(bootcamp);
        marcos.progredir();
        marcos.progredir();
        marcos.progredir();
        marcos.progredir();

        felipao.inscrever(cursoDotNet);
        felipao.inscrever(bootcamp);
        felipao.progredir();
        felipao.progredir();

        venilton.inscrever(bootcamp);
        venilton.progredir();
        venilton.progredir();
        venilton.progredir();

        List<Dev> listaDevs = Arrays.asList(felipao, venilton, marcos);

        listaDevs.stream()
                .forEach((dev) -> {
                    System.out.println(String.format("%-20s : %.2f",
                            dev.getNome(),
                            dev.calcularTotalXp()));
                });


        List<Dev> ranking = listaDevs.stream()
                .sorted((dev1, dev2) -> Double.compare(dev2.calcularTotalXp(), dev1.calcularTotalXp()))
                .collect(Collectors.toList());

        int i = 0;
        for (Dev dev : ranking) {
            i++;
            System.out.println(i + " - " + dev.getNome());
        }
    }
}
