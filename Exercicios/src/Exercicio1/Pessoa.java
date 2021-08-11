package Exercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private double altura;
    private int idade;

    public void dados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("Altura: " + getAltura() + " metros");
        System.out.println("Idade: " + getIdade() + " anos");
    }

    public void calculaIdade() {
        LocalDate calcular = dataDeNascimento;
        LocalDate dataDeHoje = LocalDate.now();
        Period periodo = Period.between(calcular, dataDeHoje);
        int idadeAgora = (periodo.getYears());
        this.idade = idadeAgora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int year, int month, int dayOfMonth) {
        this.dataDeNascimento = LocalDate.of(year,month, dayOfMonth);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade() {
        calculaIdade();
    }
}