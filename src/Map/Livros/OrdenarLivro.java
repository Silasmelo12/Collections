package Map.Livros;

import java.util.HashMap;
import java.util.Map;

public class OrdenarLivro {

    Map<String,Livro> livros = new HashMap<String, Livro>(){{
        put("Hawking, Stephen",new Livro("Uma breve história do tempo",200));
        put("Duhigg, Charles",new Livro("O poder do hábito",408));
        put("Harari, Yuval Noah",new Livro("21 lições para o século 21",432));

    }};

    public void ordemAleatoria(){
        System.out.println("ordem aleatoria");
        System.out.println(livros);
    }
//    System.out.println("ordem de insercao");
//    System.out.println("ordem natural (Nome)"); //  ordenar pela quantidad ede caracteres do nome
}
