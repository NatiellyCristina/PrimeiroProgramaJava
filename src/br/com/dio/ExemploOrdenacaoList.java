package br.com.dio;

import br.com.dio.comparator.ComparatorCor;
import br.com.dio.comparator.ComparatorIdade;
import br.com.dio.comparator.ComparatorNomeCorIdade;
import br.com.dio.model.Gato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>() {
            {
                add(new Gato("Jon", "Preto", 18));
                add(new Gato("Simba", "Tigrado", 6));
                add(new Gato("Jon", "Amarelo", 12));
            }
        };

        //Inserção
        System.out.println("Ordem de Inserção \n");
        System.out.println(meusGatos);

        //Ordem Aleátoria
        System.out.println("Ordem de Aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos + "\n");

        //Ordem Natural
        System.out.println("Ordem de Natural - Nome");
        Collections.sort(meusGatos);
        System.out.println(meusGatos + "\n");


        System.out.println("Ordem de Natural - Idade");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos + "\n");

        System.out.println("Ordem de Natural - Cor ");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos + "\n");

        //Ordem Cor, Nme e Idade
        System.out.println("Ordem  Nome/ Cor /  Idade");
        Collections.sort(meusGatos,new ComparatorNomeCorIdade());
        System.out.println(meusGatos + "\n");

    }
}
