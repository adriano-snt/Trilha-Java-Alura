package GerenciadorDeCursos.br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisando as ArrayLists", 21);
        Aula a2 = new Aula("lista de Objetos", 15);
        Aula a3 = new Aula("Relacionamento de listas e objets", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
    }
}
