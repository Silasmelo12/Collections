package LinguagemFavorita;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ordenar {

    Set<LinguagemFavorita> linguagensFavoritas = new HashSet<LinguagemFavorita>(){{
        add(new LinguagemFavorita("Java",1991,"Intellij"));
        add(new LinguagemFavorita("Python",1989,"Pycharm"));
        add(new LinguagemFavorita("MatLab",1970,"MatLab"));
    }};

    public void ordemInsercao(){
        System.out.println("Ordem de inserção");
        linguagensFavoritas.forEach(linguagemFavorita -> {
            System.out.println(linguagemFavorita);
        });
    }

    public void ordemNaturalNome(){
        Set<LinguagemFavorita> linguagensFavoritasTreeSet = new TreeSet<LinguagemFavorita>(new ComparatorNome());
        linguagensFavoritasTreeSet.addAll(linguagensFavoritas);
        System.out.println("Ordem natural Nome");
        linguagensFavoritasTreeSet.forEach(l -> {
            System.out.println(l);
        });
    }

}
