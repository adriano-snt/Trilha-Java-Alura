package Exercicio2;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public float getAltura() {
        return this.altura;
    }

    public int getIdade() {
        return idade;
    }

    public void getDados(){
        System.out.println("Nome: " + getNome() + ", idade : " + getIdade() + ", altura :" + getAltura());
    }
    public void getDadosPeloIndice(){
        System.out.println("Os dados da pessoa pelo indice são: " +
                "Nome: " + getNome() + ", idade : " + getIdade() + ", altura :" + getAltura());

    }
}
