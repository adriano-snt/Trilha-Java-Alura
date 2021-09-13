package Objects;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private String altura;
    private int idade;

    public Pessoa(String nome, int idade, String altura){
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    public Pessoa(String nome, int anoDeNascimento, int mesDeNascimento, int diaDoNascimento, String altura) {
        setNome(nome);
        setDataDeNascimento(anoDeNascimento, mesDeNascimento, diaDoNascimento);
        setAltura(altura);
    }


    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int year, int month, int dayOfMonth) {
        this.dataDeNascimento = LocalDate.of(year, month, dayOfMonth);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}