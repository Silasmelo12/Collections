package Set.Serie;

import java.util.Comparator;

public class ComparatorNomeGeneroTempo implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareToIgnoreCase(serie2.getNome());
        int genero = serie1.getGenero().compareToIgnoreCase(serie2.getGenero());
        int tempoEp = serie1.getTempoEp().compareTo(serie2.getTempoEp());
        if (nome != 0) return nome;
        if (genero != 0) return genero;
        return tempoEp;
    }
}
