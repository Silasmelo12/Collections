package Set.FavoritaLinguagem;

import java.util.Comparator;

public class ComparatorAno implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita linguagemFavorita1, LinguagemFavorita linguagemFavorita2) {
        return linguagemFavorita1.getAnoDeCriacao().compareTo(linguagemFavorita2.getAnoDeCriacao());
    }
}
