package Exercicio2;
/*
2. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
(x)void armazenaPessoa(String nome, int idade, float altura);
(x)void removePessoa(String nome);
(x)int buscaPessoa(String nome);
(x)informa em que posição da agenda está a pessoa void imprimeAgenda();
(X)imprime os dados de todas as pessoas da agenda void imprimePessoa(int index);
()imprime os dados da pessoa que está na posição “i” da agenda.
 */

import java.util.ArrayList;
import java.util.List;


public class Agenda {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList(9);
        pessoas.add(new Pessoa("Roberto", 13, 111.0F));
        pessoas.add(new Pessoa("Julio", 18, 100.0F));
        pessoas.add(new Pessoa("Fernando", 25, 180.0F));
        pessoas.add(new Pessoa("Marcos", 13, 111.0F));
        pessoas.add(new Pessoa("Evaldo", 18, 100.0F));
        pessoas.add(new Pessoa("tulio", 25, 180.0F));
        pessoas.add(new Pessoa("joao", 13, 111.0F));
        pessoas.add(new Pessoa("lucas", 18, 100.0F));
        pessoas.add(new Pessoa("marcio", 25, 180.0F));
        pessoas.add(new Pessoa("Adriano", 25, 180.0F));


        //POSIÇÃO DA PESSOA NA AGENDA
        int posicaoNaLista = 0;
        for (int i = 1; i < pessoas.size(); i++) {
            pessoas.get(i).getNome().contains("Adriano");
            posicaoNaLista = i + 1;

        }
        System.out.println("A posição da pessoa na agenda é: " + posicaoNaLista);

        //DADOS DA PESSOA PELO INDICE
        pessoas.get(posicaoNaLista - 1).getDadosPeloIndice();


        //REMOVE A PESSOA
        pessoas.removeIf(p -> p.getNome().contains("Adriano"));


        //DADOS DE TODAS AS PESSOAS DA AGENDA
        System.out.println("Todas as pessoas armazenadas na agenda: ");
        pessoas.forEach(Pessoa::getDados);


    }
}
