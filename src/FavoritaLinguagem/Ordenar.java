package FavoritaLinguagem;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ordenar {

    Set<LinguagemFavorita> linguagensFavoritas = new LinkedHashSet<LinguagemFavorita>(){{
        add(new LinguagemFavorita("Java",1991,"Intellij"));
        add(new LinguagemFavorita("Python",1989,"Pycharm"));
        add(new LinguagemFavorita("MatLab",1970,"MatLab"));
        add(new LinguagemFavorita("MatLab",1969,"MatLab"));
        add(new LinguagemFavorita("MatLab",1969,"AtLab"));
    }};

    public void ordemInsercao(){
        System.out.println("Ordem de inserção");
        linguagensFavoritas.forEach(linguagemFavorita -> {
            System.out.println(linguagemFavorita.getNome());
        });
    }

    public void ordemNaturalNome(){
        Set<LinguagemFavorita> linguagensFavoritasTreeSet = new TreeSet<LinguagemFavorita>(new ComparatorNome());
        linguagensFavoritasTreeSet.addAll(linguagensFavoritas);
        System.out.println("Ordem natural Nome");
        linguagensFavoritasTreeSet.forEach(l -> {
            System.out.println(l.getNome());
        });
    }

    public void ordemNaturalAnoCriacao(){
        Set<LinguagemFavorita> linguagemFavoritasTreeSet = new TreeSet<>(new ComparatorAno());
        linguagemFavoritasTreeSet.addAll(linguagensFavoritas);
        linguagemFavoritasTreeSet.forEach(l -> {
            System.out.println(l.getAnoDeCriacao());
        });
    }

    public void ordemNaturalIde(){
        Set<LinguagemFavorita> linguagemFavoritasTreeSet = new TreeSet<>(new ComparatorIde());
        linguagemFavoritasTreeSet.addAll(linguagensFavoritas);
        linguagemFavoritasTreeSet.forEach(l -> {
            System.out.println(l.getIde());
        });
    }

    public void ordemNaturalNomeAnoIde(){
        Set<LinguagemFavorita> linguagemFavoritasTreeSet = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagemFavoritasTreeSet.addAll(linguagensFavoritas);
        linguagemFavoritasTreeSet.forEach(l -> {
            System.out.println(l.getNome()+" - "+l.getAnoDeCriacao()+" - " + l.getIde());
        });
    }

}
