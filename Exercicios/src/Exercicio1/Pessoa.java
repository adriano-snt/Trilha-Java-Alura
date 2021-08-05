package Exercicio1;

public class Pessoa {
    private String nome;
    private int dataDeNascimento;
    private int altura;


    public void calculaIdade(){

    }

    public void dados(){
        System.out.println("Nome: "+this.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
