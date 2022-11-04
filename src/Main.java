import ExercicioProposto.MediaTemperatura;
import Listas.Listas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Listas listas = new Listas();
        //listas.exemplo_ordenacao_list();

        MediaTemperatura mediaTemperatura = new MediaTemperatura();
        List<Double> temperaturas = mediaTemperatura.lerTemperaturas();
        Double media = mediaTemperatura.mediaSemestral(temperaturas);
        System.out.println("\nA média semestral é: \n" + media);
        mediaTemperatura.TemperaturaAcimaMedia(temperaturas,media);

    }

}