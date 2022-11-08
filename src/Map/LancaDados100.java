package Map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;

public class LancaDados100 {
    Map<Integer,Integer> dados = new LinkedHashMap<>();

    public void lancar(){
        Random n = new Random();
        for (int i = 0;i<100;i++){
            int valor = n.nextInt(6)+1;
            System.out.println(valor);
        }

    }
}
