package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PopulacaoEstado {

    Map<String,Long> populacao = new LinkedHashMap<String, Long>(){{
        put("PE",9616621l);
        put("AL",3351543l);
        put("CE",9187103l);
        put("RN",3534265l);
    }};

    public void manipulador(){
        populacao.replace("RN",3534165l);
        Set<Map.Entry<String, Long>> entries = populacao.entrySet();
        entries.forEach(l->{
            System.out.println(l.getKey()+" = "+l.getValue());
        });
    }

}
