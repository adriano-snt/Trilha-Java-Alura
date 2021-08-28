
/*
Given a list of strings, write a method that returns a list of all strings
that start with the letter 'a' (lower case) and have exactly 3 letters.
*/

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ex1_String_That_Starts_With_a {
    public static void main(String[] args) {

            List<String> alunos = new LinkedList<>();
            alunos.add("abc");
            alunos.add("Adriano");
            alunos.add("Beto");
            alunos.add("Marcos");

            List<String> teste = alunos.stream()
                    .filter(s -> s.startsWith("a"))
                    .filter(s -> s.length() == 3)
                    .collect(Collectors.toList());

            System.out.println(teste);
        }
    }

