package Exercicio3;

/*
Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio.
A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo),
capacidade do elevador e quantas pessoas estão presentes nele.
A classe deve também disponibilizar os seguintes métodos:
Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
Sobe : para subir um andar (não deve subir se já estiver no último andar);
Desce : para descer um andar (não deve descer se já estiver no térreo); Encapsular todos os atributos da classe (criar os métodos set e get)
 */

public class Elevador {
    private int andarAtual;
    private int andaresPredio;
    private int capacidadeElevador;
    private int pessoasDentro;


    public Elevador(int capacidadeElevador, int andaresPredio) {
        this.andarAtual = 0;
        this.capacidadeElevador = capacidadeElevador;
        this.andaresPredio = andaresPredio;
    }


    public int entraPessoa(int qtdPessoasEntra) {
        if (this.pessoasDentro < capacidadeElevador) {
            this.pessoasDentro += qtdPessoasEntra;
        }
        return this.pessoasDentro;
    }

    public int saiPessoa(int qtdPessoasSai) {
        if (this.pessoasDentro > 1) {
            this.pessoasDentro -= qtdPessoasSai;
        }
        return this.pessoasDentro;
    }

    public int sobeElevador(int quantosAndaresSubir) {
        if (quantosAndaresSubir <= getAndaresPredio()) {
            if (getAndarAtual() + quantosAndaresSubir <= getAndaresPredio()) {
                this.andarAtual += quantosAndaresSubir;
            }
        }
        return this.andarAtual;

    }

    public int desceElevador(int quantosAndaresDescer) {
        if (quantosAndaresDescer <= andaresPredio && quantosAndaresDescer > 1) {
            this.andarAtual -= quantosAndaresDescer;
        }
        return this.andarAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getAndaresPredio() {
        return this.andaresPredio;
    }

    public int getPessoasDentro() {
        return this.pessoasDentro;
    }
}
