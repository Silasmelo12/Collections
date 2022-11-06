package Set;

import java.util.*;

public class InterfaceSet {

    public void metodosSet(){

        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));

        //Não tem como, pois não há omo trabalhar com posição dentro de Set, fica tudo aleatório
        System.out.println("Exiba a posicao da nota 5.0: ");

        // Também não tem como, pois não há omo trabalhar com posição dentro de Set
        System.out.println("Adicione na lista a nota 8 na posição 4");

        // Também não tem como
        System.out.println("Substitua a nota 5.0 pela nota 6.0");

        System.out.println("Confira se a nota 5 está no conjunto: "+notas.contains(5d));

        //não tem como
        System.out.println("Exiba a terceira nota adicionada");

        System.out.println("exiba a menor nota: "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

        System.out.println("exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        double soma =0;
        while (iterator.hasNext()){
            double valor = iterator.next();
            soma+=valor;
        }
        System.out.println("Soma: " + soma);

        System.out.println("exiba a media das notas"+soma/notas.size());

        System.out.println("remova a nota 0");
        notas.remove(0d);

        //não tem como
        System.out.println("remova a nota da posicao 0");

        System.out.println("remova as notas menores que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double valor = iterator1.next();
            if (valor<7){
                iterator1.remove();
            }
        }

        //não tem como
        System.out.println("exiba todas as notas na ordem que foram informadas");
        Set<Double> notasLinked = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notasLinked);

        System.out.println("Exiba todo na ordme crescente");
        Set<Double> notasTree = new TreeSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notasTree);

        System.out.println("apague toda a lista");
        notas.clear();

        System.out.println("verifique se a lista está vazia: "+notas.isEmpty());
    }

    public void exemplo_ordenacao_list(){

        Set<Serie> series = new HashSet<Serie>(){{
            add(new Serie("gol","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70s show'","comédia",25));
        }};

        Set<Serie> seriesLinked = new LinkedHashSet<Serie>(){{
            add(new Serie("gol","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70s show'","comédia",25));
        }};

        Set<Serie> seriesTree = new TreeSet<Serie>(){{
            add(new Serie("gol","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70s show'","comédia",25));
        }};

        System.out.println("ordem de insercao");
        seriesLinked.forEach(serie -> {
            System.out.print(serie.getNome()+", ");
        });

        System.out.println("\n\nordem aleatoria");
        series.forEach(serie -> {
            System.out.print(serie.getNome()+", ");
        });

        System.out.println("\n\nordem natural (tempoEp)"); //  ordenar pela quantidad ede caracteres do nome
        seriesTree.forEach(serie -> {
            System.out.print(serie.getTempoEp()+", ");
        });

        System.out.println("\n\nOrdem pelo nome");
        Set<Serie> seriesTree3 = new TreeSet<>(new ComparatorNome());
        seriesTree3.addAll(series);
        seriesTree3.forEach(serie -> {
            System.out.println(serie.getNome()+", ");
        });

        System.out.println("\n\nordem nome/genero/tempo");
        Set<Serie> seriesTree2 = new TreeSet<Serie>(new ComparatorNomeGeneroTempo());
        seriesTree2.addAll(series);
        seriesTree2.forEach(serie -> {
            System.out.print(serie.getTempoEp()+", ");
        });
    }
}
