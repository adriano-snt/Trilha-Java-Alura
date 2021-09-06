package Exercicio4;

public class TestaControle{
    public static void main(String[] args) {
        Controle controle = new Controle();
        controle.informacoes();
        controle.aumentarNumeroCanal();
        controle.aumentarVolume();
        controle.informacoes();
        controle.diminuirNumeroCanal();
        controle.diminuirVolume();
        controle.informacoes();
        controle.selecionarCanal(10);
        controle.informacoes();
    }

}
