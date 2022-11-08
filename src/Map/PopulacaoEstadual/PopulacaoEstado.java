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

    }

}
