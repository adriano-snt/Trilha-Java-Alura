package Services;

import Objects.Elevador;

public class ElevadorService {
    static int capacidadeElevador = 5;
    static int andaresPredio = 10;
    static int andarUnitario = 1;

    Elevador elevador = new Elevador(capacidadeElevador, andaresPredio);

    public void informações() {
        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Quantidade de pessoas dentro: " + elevador.getPessoasDentro());
    }


    public void entraPessoa(int qtdPessoasEntra) {
        if (elevador.getPessoasDentro() < elevador.getCapacidadeElevador()) {
            elevador.setPessoasDentro(this.elevador.getPessoasDentro() + qtdPessoasEntra);
        }
    }


    public void saiPessoa(int qtdPessoasSai) {
        if (elevador.getPessoasDentro() > andarUnitario) {
            elevador.setPessoasDentro(elevador.getPessoasDentro() - qtdPessoasSai);
        }
    }


    public void sobeElevador(int quantosAndaresSubir) {
        if (elevador.getAndarAtual() + quantosAndaresSubir <= elevador.getAndaresPredio()) {
            elevador.setAndarAtual(elevador.getAndarAtual() + quantosAndaresSubir);
        }
    }


    public void desceElevador(int quantosAndaresDescer) {
        if (quantosAndaresDescer <= elevador.getAndaresPredio() && quantosAndaresDescer > andarUnitario) {
            elevador.setAndarAtual(elevador.getAndarAtual() - quantosAndaresDescer);
        }
    }
}
