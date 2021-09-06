package Exercicio3;

public class TestaElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 12);
        elevador.entraPessoa(3);
        elevador.sobeElevador(11);
        elevador.saiPessoa(1);
        elevador.desceElevador(5);

        System.out.println("O andar atual é: "+ elevador.getAndarAtual());
        System.out.println("A quantidade de pessoas dentro do elevador é: " + elevador.getPessoasDentro());
    }
}
