package service;

import model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BonusServiceTest {

    @Test
    @DisplayName("Bonus deve ser zero para funcionário com salário muito alto")
    public void zeroBonus() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Roberto", LocalDate.now(), new BigDecimal("25000")));

       assertEquals(new BigDecimal("0.00"), bonus);

    }
    @Test
    @DisplayName("Bonus deve ser 10% do salário")
    public void tenBonus() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Roberto", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.00"), bonus);

    }

    @Test
    @DisplayName("Bonus deveria ser 10% para salário de 10.000 reais")
    public void bonusTenTo10000() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Roberto", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);

    }
}