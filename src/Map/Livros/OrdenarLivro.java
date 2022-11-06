package Map.Livros;

import java.util.*;

public class OrdenarLivro {

    Map<String,Livro> livros = new HashMap<String, Livro>(){{
        put("Hawking, Stephen",new Livro("Uma breve história do tempo",200));
        put("Duhigg, Charles",new Livro("O poder do hábito",408));
        put("Harari, Yuval Noah",new Livro("21 lições para o século 21",432));
    }};

    public void ordemAleatoria(){
        System.out.println("ordem aleatoria");
        Set<Map.Entry<String,Livro>> entries = livros.entrySet();
        entries.forEach(entry -> {
            System.out.println("autor: "+entry.getKey()+" nome: "+entry.getValue().getNome());
        });
    }
//    System.out.println("ordem de insercao");
    public void ordemInsercao(){
        Map<String,Livro> livroLinkedHashMap = new LinkedHashMap<String,Livro>(){{
            put("Hawking, Stephen",new Livro("Uma breve história do tempo",200));
            put("Duhigg, Charles",new Livro("O poder do hábito",408));
            put("Harari, Yuval Noah",new Livro("21 lições para o século 21",432));
        }};
        Set<Map.Entry<String, Livro>> entries = livroLinkedHashMap.entrySet();
        entries.forEach(l -> {
            System.out.println(l.getValue().getNome());
        });
    }

    public void ordemAlfabeticaAutores(){
        System.out.println("Ordem alfabética autorees"); //  ordenar pela quantidad ede caracteres do nome
        Map<String,Livro> livroLinkedHashMap = new TreeMap<String, Livro>(){{
            put("Hawking, Stephen",new Livro("Uma breve história do tempo",200));
            put("Duhigg, Charles",new Livro("O poder do hábito",408));
            put("Harari, Yuval Noah",new Livro("21 lições para o século 21",432));
        }};
        Set<Map.Entry<String, Livro>> entries = livroLinkedHashMap.entrySet();
        entries.forEach(l -> {
            System.out.println(l.getKey());
        });
    }
}
