package FavoritaLinguagem;

import java.util.Comparator;

public class ComparatorIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita linguagemFavorita1, LinguagemFavorita linguagemFavorita2) {
        return linguagemFavorita1.getIde().compareToIgnoreCase(linguagemFavorita2.getIde());
    }
}
