package br.com.dio;

import br.com.dio.model.Serie;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {
        System.out.println("Ordem Aleatória");
        Set<Serie> minhasSeries = new HashSet<>() {
            {
                add(new Serie("got", "fantasia", 60));
            }

            {
                add(new Serie("dark", "drama", 60));
            }

            {
                add(new Serie("that '70s show", "comedia", 25));
            }
        };

        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("\n Ordem Inserção");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
            {
                add(new Serie("got", "fantasia", 60));
            }

            {
                add(new Serie("dark", "drama", 60));
            }

            {
                add(new Serie("that '70s show", "comedia", 25));
            }
        };

        for (Serie serie : minhasSeries1)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("\n Ordem Natural - Tempo de episódio");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }
}
