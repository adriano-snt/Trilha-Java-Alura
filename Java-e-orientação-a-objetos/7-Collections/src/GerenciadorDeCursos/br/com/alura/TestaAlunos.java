package GerenciadorDeCursos.br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio");
        alunos.add("Nico Steppa");
        alunos.add("Nico Steppa");
        alunos.add("Nico Steppa");

        boolean pauloEstaMatriculado = alunos.contains("nico steppa");
        System.out.println(pauloEstaMatriculado);

        for (String aluno:alunos
             ) {
            System.out.println(aluno); ;
        }

        System.out.println(alunos);
    }
}
