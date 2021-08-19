package GerenciadorDeCursos.br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando ";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);


        for (String x: aulas) {
            System.out.println("Aula: " + x);
        }

        //=========================================

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é : " + primeiraAula);

        //=========================================

        for(int i = 0; i <aulas.size(); i++ ){
            System.out.println("aula :" + aulas.get(i));
        }

        //=========================================

        aulas.forEach(aula -> {
            System.out.println("percorrendo :" + aula);
        });

        //=========================================

        aulas.add("Aumentando conhecimento");
        System.out.println("Antes");
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println("Depois");
        System.out.println(aulas);



    }

}
