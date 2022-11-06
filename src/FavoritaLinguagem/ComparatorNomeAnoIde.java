package FavoritaLinguagem;

import java.util.Comparator;

public class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita linguagemFavorita1, LinguagemFavorita linguagemFavorita2) {
        int nome =  linguagemFavorita1.getNome().compareToIgnoreCase(linguagemFavorita2.getNome());
        int ano = linguagemFavorita1.getAnoDeCriacao().compareTo(linguagemFavorita2.getAnoDeCriacao());
        if (nome != 0) return nome;
        if (ano != 0) return ano;
        return linguagemFavorita1.getIde().compareToIgnoreCase(linguagemFavorita2.getIde());
    }
}
