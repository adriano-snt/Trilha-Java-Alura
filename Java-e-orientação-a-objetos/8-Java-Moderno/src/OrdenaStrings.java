import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

//        Comparator<String> comparador = new ComparadorPorTamanho();
//
//        Consumer<String> consumidor = new ConsumidorDeString();
        //Collections.sort(palavras, comparador);

        //palavras.sort(comparador);

//        palavras.forEach(consumidor);
        System.out.println(palavras);
        //Using default methods
        palavras.sort(Comparator.comparing(s -> s.length()));

        //Using methods referenfce
        palavras.forEach(System.out::println);

    }
}
