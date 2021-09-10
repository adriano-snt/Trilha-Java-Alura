package Objects;

public class Elevador {
    private int andarAtual;
    private int andaresPredio;
    private int capacidadeElevador;
    private int pessoasDentro;


    public Elevador(int capacidadeElevador, int andaresPredio) {
        this.setAndarAtual(0);
        this.setCapacidadeElevador(capacidadeElevador);
        this.setAndaresPredio(andaresPredio);
    }


    public int entraPessoa(int qtdPessoasEntra) {
        if (this.getPessoasDentro() < getCapacidadeElevador()) {
            this.setPessoasDentro(this.getPessoasDentro() + qtdPessoasEntra);
        }
        return this.getPessoasDentro();
    }

    public int saiPessoa(int qtdPessoasSai) {
        if (this.getPessoasDentro() > 1) {
            this.setPessoasDentro(this.getPessoasDentro() - qtdPessoasSai);
        }
        return this.getPessoasDentro();
    }

    public int sobeElevador(int quantosAndaresSubir) {
        if (quantosAndaresSubir <= getAndaresPredio()) {
            if (getAndarAtual() + quantosAndaresSubir <= getAndaresPredio()) {
                this.setAndarAtual(this.getAndarAtual() + quantosAndaresSubir);
            }
        }
        return this.getAndarAtual();

    }

    public int desceElevador(int quantosAndaresDescer) {
        if (quantosAndaresDescer <= getAndaresPredio() && quantosAndaresDescer > 1) {
            this.setAndarAtual(this.getAndarAtual() - quantosAndaresDescer);
        }
        return this.getAndarAtual();
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getAndaresPredio() {
        return andaresPredio;
    }

    public void setAndaresPredio(int andaresPredio) {
        this.andaresPredio = andaresPredio;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getPessoasDentro() {
        return pessoasDentro;
    }

    public void setPessoasDentro(int pessoasDentro) {
        this.pessoasDentro = pessoasDentro;
    }
}
