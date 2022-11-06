package Set.Serie;

import java.util.Comparator;

public class ComparatorGenero implements Comparator<Serie> {
    @Override
    public int compare(Serie o1, Serie o2) {
        return o1.getGenero().compareToIgnoreCase(o2.getGenero());
    }
}
