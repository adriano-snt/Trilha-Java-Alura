package Services;

import Objects.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AgendaService {

    List<Pessoa> pessoas = new ArrayList<>();

    public void adicionaPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void imprimeAgenda() {
        pessoas.stream()
                .map(pessoa -> "Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade() + ", altura: " + pessoa.getAltura())
                .forEach(System.out::println);
    }


    public void encontraIndice(String nome) {
        int indice = IntStream.range(0, pessoas.size())
                .filter(p -> pessoas.get(p).getNome().equals(nome))
                .findFirst()
                .orElse(-1);

        System.out.println("O índice de " + nome + " na agenda é: " + indice);
    }


    public void dadosPeloIndice(int i) {
        System.out.println("Os dados do índice " + i + " na agenda são:" + "\nNome: " + pessoas.get(i).getNome() + ", idade: " + pessoas.get(i).getIdade() + ", altura: " + pessoas.get(i).getAltura() + " metros");
    }


    public void removePessoa(String nome) {
        int indice = IntStream.range(0, pessoas.size())
                .filter(p -> pessoas.get(p).getNome().equals(nome))
                .findFirst()
                .orElse(-1);

        System.out.println(pessoas.get(indice).getNome() + " foi removido da agenda ");
        System.out.println("Os seus dados eram: " + "\nIndíce na agenda: " + indice + ", idade: " + pessoas.get(indice).getIdade() + ", altura: " + pessoas.get(indice).getAltura() + " metros");

        pessoas.removeIf(pessoa -> pessoa.getNome().contains(nome));
    }
}
