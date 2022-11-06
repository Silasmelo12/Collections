package Set.Serie;

import java.util.Objects;

public class Serie implements Comparable<Serie>{

    private String nome;
    private String genero;
    private Integer tempoEp;

    public Serie(String nome, String genero, Integer tempoEp) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEp = tempoEp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEp() {
        return tempoEp;
    }

    public void setTempoEp(Integer tempoEp) {
        this.tempoEp = tempoEp;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEp=" + tempoEp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEp.equals(serie.tempoEp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEp);
    }

    @Override
    public int compareTo(Serie serie) {

//        int ep = Integer.compare(this.getTempoEp(),serie.getTempoEp());
        int ep = this.getTempoEp().compareTo(serie.getTempoEp());
        if (ep!=0)
            return ep;
        return this.getGenero().compareTo(serie.getGenero());
    }
}
