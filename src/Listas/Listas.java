package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Listas {
//        List notas = new ArrayList(); // antes do Java 5
//
//        List<Double> notas = new ArrayList<Double>(); //Diamond Operator
//
//        ArrayList<Double> notas = new ArrayList<>();
//
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.4));
//
//        List<Double> notas = Arrays.asList(7d, 8.5, 9.4); // Não é possível adicionar item nessa lista
//
//        List<Double> notas = List.of(7d, 8.5, 9.4); // Esta lista é imutável, então não é possível adicionar novos itens ou remover.
    public void exemplo_list() {

        List<Double> notas = new ArrayList<Double>();
        notas.add(0d);
        notas.add(1d);
        notas.add(2d);
        notas.add(3d);
        notas.add(4d);

        System.out.println(notas.toString());
        System.out.println("Exiba a posicao do elemento 3: " + notas.indexOf(3d));

        //pode ser adicionado elementos no meio da lista.
        System.out.println("Adicione a nota 5 na posicao 5");
        notas.add(5, 5d);

        //substitui de fato o elemento
        System.out.println("Substitua o elemento 2 por 5");
        notas.set(notas.indexOf(2d), 5d);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5 está na lista. " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem que foram adicionadas");
        for (
                Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior notas: " + Collections.max(notas));

        System.out.println("Exiba a soma das notas: ");

        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma: " + soma);

        System.out.println("Exibe a média das notas: " + soma / notas.size());

        System.out.println("Remova a nota 0");
        notas.remove(0d);

        System.out.println("Remova a nota da posicao 0");
        notas.remove(0);

        System.out.println("remova as notas menos que 4");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next <= 4) {
                iterator1.remove();
            }
        }
        System.out.println(notas.toString());

        System.out.println("apague toda a lista");
        notas.clear();

        System.out.println("confira se a lista está vazia. " + notas.isEmpty());

    }

    public void exemplo_ordenacao_list(){

        List<Gato> gatos = new ArrayList(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("Jon",12,"amarela"));
        }};

        System.out.println("ordem de insercao");
        System.out.println(gatos);

        System.out.println("ordem aleatoria");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("ordem natural (Nome)"); //  ordenar pela quantidad ede caracteres do nome
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("ordem idade");

        System.out.println("ordem cor");

        System.out.println("ordem nome/cor/idade");

    }

}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.nome);
    }
}
