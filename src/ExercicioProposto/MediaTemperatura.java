package ExercicioProposto;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Collectors;

public class MediaTemperatura {
    final List<String> meses = new ArrayList<>(Arrays.asList("1 - Janeiro", "2 - Fevereiro", "3 - Março", "4 - Abril", "5 - Maio", "6 - Junho"));
    Scanner entrada = new Scanner(System.in);

    public List<Double> lerTemperaturas() {
        List<Double> temperaturas = new ArrayList<>();
        System.out.println("Informe a temperatura de cada mês.\n");
        for (int i = 0; i < 6; i++) {
            System.out.print(meses.get(i)+": ");
            temperaturas.add(entrada.nextDouble());
        }
        return temperaturas;
    }

    public Double mediaSemestral(List<Double> temperaturas) {
        double soma = 0;
        Iterator<Double> iterator = temperaturas.iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        return soma / temperaturas.size();
    }

    public void TemperaturaAcimaMedia(List<Double> temperaturas, double media) {
        //List<Double> temperaturasElevada = new ArrayList<>();
        //List<String> mesElevado = new ArrayList<>();
        System.out.println("\nAs temperaturas acima da média são: ");
        for (int i =0; i<temperaturas.size();i++){
            if (temperaturas.get(i) > media) {
                //temperaturasElevada.add(temperaturas.get(i));
                //mesElevado.add(meses.get(i));
                System.out.println(meses.get(i)+": "+temperaturas.get(i));
            }
        }
    }
}
