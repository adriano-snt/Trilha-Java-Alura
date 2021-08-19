package GerenciadorDeCursos.br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColeções = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        List<Aula> aulas = javaColeções.getAulas();
        System.out.println(aulas);

        //javaColeções.getAulas().add(new Aula("Trabalhando com arraylist", 22));

        javaColeções.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColeções.adiciona(new Aula("Criando uma Aula", 20));
        javaColeções.adiciona(new Aula("Modelando com coleções", 23));
        System.out.println(javaColeções.getAulas());
        System.out.println("================");
        System.out.println(aulas);;
    }
}
