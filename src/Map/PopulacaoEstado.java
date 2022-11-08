package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

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

    }

}
