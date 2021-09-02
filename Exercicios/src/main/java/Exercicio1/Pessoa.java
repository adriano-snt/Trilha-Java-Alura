package Exercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private String altura;
    private int idade;

    public void dados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getDataDeNascimento());
        System.out.println("Altura: " + this.getAltura() + " metros");
        System.out.println("Idade: " + this.getIdade() + " anos");
    }

    public void calculaIdade() {
        LocalDate calcular = this.dataDeNascimento;
        LocalDate dataDeHoje = LocalDate.now();
        Period periodo = Period.between(calcular, dataDeHoje);
        this.idade = periodo.getYears();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        DateTimeFormatter formatadorDeData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.dataDeNascimento.format(formatadorDeData);
    }

    public void setDataDeNascimento(int year, int month, int dayOfMonth) {
        this.dataDeNascimento = LocalDate.of(year, month, dayOfMonth);
    }

    public String getAltura() {
        return this.altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade() {
        this.calculaIdade();
    }
}