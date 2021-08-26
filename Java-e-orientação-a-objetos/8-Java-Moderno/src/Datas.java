import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        //System.out.println(hoje);

        LocalDate dia = LocalDate.of(2099, Month.JANUARY, 25);
        Period calc = Period.between(hoje, dia);
        System.out.println(calc.getUnits());



        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = hoje.format(formatador);
        System.out.println(dataFormatada);

    }
}


