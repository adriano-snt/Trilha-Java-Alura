package Exercicio1;

import java.util.Scanner;

public class TestaPessoa extends Pessoa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alberto");
        pessoa.setDataDeNascimento(1996, 8, 3);
        pessoa.setAltura("1.8");
        pessoa.setIdade();
        pessoa.dados();
    }

}


