package Listas;

import java.util.Comparator;

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0) {
            return nome;
        }

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());

        if (cor != 0) {
            return cor;
        }

        int idade = Integer.compare(gato1.getIdade(), gato2.getIdade());
        return idade;
    }
}
