package Set;

import java.util.Comparator;

public class ComparatorNome implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        return serie1.getNome().compareToIgnoreCase(serie2.getNome());
    }
}
