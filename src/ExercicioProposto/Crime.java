package ExercicioProposto;

import java.util.*;

public class Crime {

    Scanner entrada = new Scanner(System.in);
    List<String> perguntas = new ArrayList<>(Arrays.asList(
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou para a vítima?"));

    public List<String> fazerPerguntas(){
        List<String> respostas = new ArrayList<>();

        for (String pergunta:perguntas) {
            System.out.println(pergunta);
            System.out.println("1 - sim");
            System.out.println("2 - não");
            while (true){
                int i = entrada.nextInt();
                if(i == 1){
                    respostas.add("Sim");
                    break;
                }else if(i == 2) {
                    respostas.add("Não");
                    break;
                }else{
                    System.out.println("Opção inválida");
                }
            }
        }
        return respostas;
    }

    public String classificar(List<String> respostas){
        int quant = 0;
        for (String resposta:respostas) {
            if (resposta.equalsIgnoreCase("sim")){
                quant+=1;
            }
        }
        switch (quant){
            case 2:
                return "Suspeita";
            case 3:
                return "Cúmplice";
            case 4:
                return "Cúmplice";
            case 5:
                return "Assassina";
            default:
                return "Inocente";
        }
    }
}
