package Objects;

public class Elevador {
    private int andarAtual;
    private int andaresPredio;
    private int capacidadeElevador;
    private int pessoasDentro;


    public Elevador(int capacidadeElevador, int andaresPredio) {
        setCapacidadeElevador(capacidadeElevador);
        setAndaresPredio(andaresPredio);
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
