package Map.LancaDados;

import java.util.*;

public class LancaDados100 {
    Map<Integer,Integer> dados = new LinkedHashMap<>();

    public void lancar(){
        Random n = new Random();
        for (int i = 0;i<100;i++){
            int valor = n.nextInt(6)+1;
            dados.put(i,valor);
        }
        Set<Map.Entry<Integer, Integer>> entries = dados.entrySet();
        entries.forEach(l->{
            System.out.println(l.getKey()+1+" - "+ l.getValue());
        });

    }
}
