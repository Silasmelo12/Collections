package Set.ArcoIris;

import java.util.*;

public class Manipulador {
    Scanner entrada = new Scanner(System.in);
    Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
    public void ExibirCores(){
        Set<String> arcoIrisSet = new HashSet<>();
        arcoIrisSet.addAll(arcoIris);
        System.out.println("Cores");
        arcoIrisSet.forEach(cor -> {
            System.out.println(cor);
        });
    }

    public void quantidadeCores(){
        System.out.println("\nQuantidade de cores: " + arcoIris.size());
    }

    public void exibirCoresOrdemAlfabetica(){
        Set<String> arcoIrisTree = new TreeSet<>(arcoIris);

        System.out.println("\nOrdem Alfabética");

        arcoIrisTree.forEach(cor -> {
            System.out.println(cor);
        });
    }

    public void exibirCoresInversamente(){
        List<String> listCor = new ArrayList<>(arcoIris);
        Collections.reverse(listCor);
        System.out.println("\nInverso");
        listCor.forEach(cor -> {
            System.out.println(cor);
        });
    }

    public void exibirCoresIniciaV(){
        Iterator<String> iterator = arcoIris.iterator();
        System.out.println("\nCores que começam com v: ");
        while (iterator.hasNext()){
            String cor = iterator.next();
            if (cor.charAt(0)=='v'){
                System.out.println(cor);
            }
        }
    }

    public void removerCoresNaoIniciaV(){
        Iterator<String> iterator = arcoIris.iterator();
        System.out.println("Remover cores que não iniciam com V");
        while (iterator.hasNext()){
            String cor = iterator.next();
            if (!cor.startsWith("v")){
                System.out.println("removeu a cor: "+cor);
                iterator.remove();
            }
        }
        arcoIris.forEach(cor -> {
            System.out.println(cor);
        });
    }

    public void limparConjunto(){
        arcoIris.clear();
    }

    public void conferirConjuntoVazio(){

        if (arcoIris.isEmpty()){
            System.out.println("O conjunto está vazio.");
        }else {
            System.out.println("O conjunto não está vazio.");
        }
    }
}
