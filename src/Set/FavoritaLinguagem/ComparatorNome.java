package Set.FavoritaLinguagem;

import java.util.Comparator;

public class ComparatorNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita linguagemFavorita1, LinguagemFavorita linguagemFavorita2) {
        return linguagemFavorita1.getNome().compareToIgnoreCase(linguagemFavorita2.getNome());
    }
}
