package br.com.dio;

import java.util.*;

public class AlgunsMetodosSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5d,9.3d, 5d, 7d, 0d, 3.6d));

        //Observa-se que elementos iguais não são repetidos e não é apresentado na ordem de inserção
        System.out.println("Notas: " + notas);

        // Não é possível realizar as operações comentadas pois o Set não possui indice.
        //Exibir posição da nota 5
        //Adicione na lista a nota 8.0 na posição 4 - Idem
        //Substitua a nora 5 pela nota 6

        System.out.println("Confira se a nota 5.0 esta no conjunto: " + notas.contains(5.0d) + "\n");

        //Exibir a terceira nota adicionada - Não é possível realizar pois não temos o método get

        System.out.println("Exiba a menor nota:" + Collections.min(notas) );
        System.out.println("Exiba a maior nota:" + Collections.max(notas));

        System.out.println("Exibir a soma dos valores:");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0d;
        while(iterator.hasNext()){ //tem um elemento depois do cursor, se sim continua e cursos vai para o proximo elemento
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba o valor da soma:" + soma);
        System.out.println("Exiba a média :" + soma / notas.size());
        System.out.println("Remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas + "\n");

        System.out.println("Remova as notas maiores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas + "\n");

        System.out.println("Exiba todas as notas na ordem que foram informadas");
        //Criado uma nova variável com LinkedHashSet pois o  HashSet guarda os valores de forma aleatória
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5d,9.3d, 5d, 7d, 0d, 3.6d));
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        //Utilizado o TreeSet pois o mesmo mantem por defauld a ordem natural dos elementos
        System.out.println(notas3 + "\n");

        System.out.println("Apague todo o conjunto");
        notas3.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());


    }
}
