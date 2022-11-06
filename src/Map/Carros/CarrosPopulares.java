package Map.Carros;

import java.util.*;

public class CarrosPopulares {

    Map<String,Double> carrosPopulares = new HashMap<String, Double>(){{
        put("gol",14.4);
        put("uno",15.6);
        put("mobi",16.1);
        put("hb20",14.5);
        put("kwid",15.6);
    }};

    public void exibirCarrosPopulares(){
        System.out.println("Carros");
        System.out.println(carrosPopulares.toString());
    }

    public void substituirConsumoGol(){
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares.toString());
    }

    public void verificarTucson(){
        System.out.println("Tucon está: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("Exibir o consumo do uno: " + carrosPopulares.get("uno"));

        //Não tem como
        System.out.println("Exibir o terceiro modelo adicionado");

        System.out.println("Exibir todos os modelos");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);



    }

    public void modeloMaisEconomico(){
        System.out.println("Modelo mais economico");
        Double max = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente;

        for (Map.Entry<String,Double> entry:entries) {
            if(entry.getValue().equals(max)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente é: "+modeloMaisEficiente+" - "+max);
            }
        }
    }

    public void modeloMenosEconomico(){

        Double min = Collections.min(carrosPopulares.values());//valor minimo
        String modeloMenosEficiente;
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        for (Map.Entry<String, Double> entry:entries) {
            System.out.println("teste: " + entry);
            if(entry.getValue().equals(min)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("modelo menos eficiente: "+modeloMenosEficiente);
            }
        }
    }

    public void somaConsumo(){
        Double soma = 0d;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("Soma do consumo: "+soma);
    }
    public void mediaConsumo(){
        Double soma = 0d;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while (iterator.hasNext()){
            soma+=iterator.next();
        }
        System.out.println("Media de consumo: "+soma/carrosPopulares.size());
    }

    public void removerModelo(){
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            if (next.equals(15.6)){
                iterator.remove();
            }
        }
        System.out.println(carrosPopulares);
    }

    public void exibirOrdenadoAdicionado(){
        //para fazer isso, o conjunto precisa ser LinkedHashMap
        Map<String,Double> carrosPopulares = new LinkedHashMap<String, Double>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares);
    }

    public void exibirOrdenadoChave(){
        // para fazer isso, precisa ser TreeMap
        Map<String,Double> carrosPopulares = new TreeMap<String, Double>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares);
    }

    public void limparConjunto(){
        carrosPopulares.clear();
    }

    public void verificaListaVazia(){
        if (carrosPopulares.isEmpty()) System.out.println("Lista vazia");
        else System.out.println("Lista não vazia");
    }
}
