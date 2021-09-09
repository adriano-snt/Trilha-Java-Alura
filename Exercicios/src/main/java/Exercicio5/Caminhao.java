package Exercicio5;

import java.util.List;
import java.util.Objects;

public class Caminhao {
    private String tipoCaminhao;
    private  int capacidadePluviometros;
    private List<Integer> pluviometros;


    public Caminhao(String tipoCaminhao, int capacidadePluviometros, List<Integer> pluviometros){
       setTipoCaminhao(tipoCaminhao);
       setCapacidadePluviometros(capacidadePluviometros);
       setPluviometros (pluviometros);
    }

    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    public int getCapacidadePluviometros() {
        return capacidadePluviometros;
    }

    public void setCapacidadePluviometros(int capacidadePluviometros) {
        this.capacidadePluviometros = capacidadePluviometros;
    }


    @Override
    public int hashCode() {
        return Objects.hash(capacidadePluviometros);
    }

    public void setPluviometros(List<Integer> pluviometros) {
        this.pluviometros = pluviometros;
    }

    public List<Integer> getPluviometros() {
        return pluviometros;
    }
}






