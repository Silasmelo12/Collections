package Map.PopulacaoEstadual;

import java.util.*;

public class PopulacaoEstado {

    Map<String, Long> populacao = new LinkedHashMap<String, Long>() {{
        put("PE", 9616621l);
        put("AL", 3351543l);
        put("CE", 9187103l);
        put("RN", 3534265l);
    }};

    public void manipulador() {
        System.out.println("Lista: ");
        Set<Map.Entry<String, Long>> entries = populacao.entrySet();
        entries.forEach(l -> {
            System.out.println(l.getKey() + " = " + l.getValue());
        });

        System.out.println("substituir valor RN para 3534165");

        populacao.replace("RN", 3534165l);

        entries = populacao.entrySet();
        entries.forEach(l -> {
            System.out.println(l.getKey() + " = " + l.getValue());
        });

        System.out.println("Confira se o estado PB está na lista, se não, adicione: PB = 4039277");
        if(!populacao.containsKey("PB")){
            populacao.put("PB",4039277l);
        }
        entries = populacao.entrySet();
        entries.forEach(l -> {
            System.out.println(l.getKey() + " = " + l.getValue());
        });

        System.out.println("Exibe apenas a população de pernambuco: "+populacao.get("PE"));

        System.out.println("Ordem alfabética");
        entries = new TreeMap<String,Long>(populacao).entrySet();
        entries.forEach(l -> {
            System.out.println(l.getKey() + " = " + l.getValue());
        });

        System.out.println("Estado com menor população.");
        Long min = Collections.min(populacao.values());
        entries = populacao.entrySet();
        entries.forEach(l->{
            if(l.getValue().equals(min.longValue())){
                System.out.println(l.getKey()+" = "+l.getValue());
            }
        });

        System.out.println("Estado com maior população");
        Long max = Collections.max(populacao.values());
        entries = populacao.entrySet();
        entries.forEach(l->{
            if(l.getValue().equals(max.longValue())){
                System.out.println(l.getKey()+" = "+l.getValue());
            }
        });

        System.out.println("Soma da população dos estados");
        long soma = 0;
        entries = populacao.entrySet();
        Iterator<Map.Entry<String, Long>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            soma += iterator.next().getValue();
        }
        System.out.println(soma);

        System.out.println("Média populacional: "+soma/populacao.size());

        System.out.println("Remover estados com populacao menor que 4.000.000");
        Iterator<Long> iterator1 = populacao.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next()<=4000000l){
                iterator1.remove();
            }
        }
        entries = populacao.entrySet();
        entries.forEach(l->{
            System.out.println(l.getKey()+" - "+l.getValue());
        });

        System.out.println("Apagar todos os estados");
        populacao.clear();

        System.out.println("Verificar se a lista está vazia: "+populacao.isEmpty());
    }

}
