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

    public void contagem(){
        Iterator<Integer> iterator = dados.values().iterator();
        int valor1=0, valor2=0, valor3=0, valor4=0, valor5=0, valor6 = 0;
        while (iterator.hasNext()){
            Integer valor = iterator.next();
            if (valor == 1) valor1+=1;
            if (valor == 2) valor2+=1;
            if (valor == 3) valor3+=1;
            if (valor == 4) valor4+=1;
            if (valor == 5) valor5+=1;
            if (valor == 6) valor6+=1;
        }
        System.out.println("Número de vezes que cada valor apareceu");
        System.out.println("valor 1 = " + valor1);
        System.out.println("valor 2 = " + valor2);
        System.out.println("valor 3 = " + valor3);
        System.out.println("valor 4 = " + valor4);
        System.out.println("valor 5 = " + valor5);
        System.out.println("valor 6 = " + valor6);
    }
}
