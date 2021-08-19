package GerenciadorDeCursos.br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColeções = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        //javaColeções.getAulas().add(new Aula("Trabalhando com arraylist", 22));

        javaColeções.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColeções.adiciona(new Aula("Criando uma Aula", 20));
        javaColeções.adiciona(new Aula("Modelando com coleções", 23));

        List<Aula> aulasImutaveis = javaColeções.getAulas();
        System.out.println(aulasImutaveis);
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);

        System.out.println(aulas);
        System.out.println(javaColeções.getTempoTotal());

        System.out.println(javaColeções);



    }
}
