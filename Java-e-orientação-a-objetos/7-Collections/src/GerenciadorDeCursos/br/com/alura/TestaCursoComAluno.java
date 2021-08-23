package GerenciadorDeCursos.br.com.alura;

import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 23));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672 );
        Aluno a2 = new Aluno("Guilherme Silveria", 5618);
        Aluno a3 = new Aluno("Mauricio Anixe", 1390);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os aluno matriculados : ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println(javaColecoes.estaMatriculado(a1));

        String nome = "Rodrigo Turini";;
        

    }

}
