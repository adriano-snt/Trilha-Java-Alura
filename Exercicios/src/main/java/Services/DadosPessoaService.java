package Services;

import Objects.Pessoa;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DadosPessoaService {
    static String nome = "Adriano";
    static int anoDeNascimento = 1990;
    static int mesDenascimento = 8;
    static int diaDoNascimento = 5;
    static String altura = "1.8";

    private Pessoa pessoa2 = new Pessoa(nome, anoDeNascimento, mesDenascimento, diaDoNascimento, altura);

    public int idadeCalculada() {
        LocalDate calcular = pessoa2.getDataDeNascimento();
        LocalDate dataDeHoje = LocalDate.now();
        Period periodo = Period.between(calcular, dataDeHoje);
        pessoa2.setIdade(periodo.getYears());
        return pessoa2.getIdade();
    }


    public String dataDeNascimentoFormatada() {
        DateTimeFormatter formatadorDeData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return pessoa2.getDataDeNascimento().format(formatadorDeData);
    }


    public void getDados() {
        System.out.println("Nome: " + pessoa2.getNome() + "\nIdade: " + idadeCalculada() + "\nAltura: " + pessoa2.getAltura() + " metros" + "\nData de nascimento: " + dataDeNascimentoFormatada());
    }
}
