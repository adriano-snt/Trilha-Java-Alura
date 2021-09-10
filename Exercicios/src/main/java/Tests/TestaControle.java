package Tests;

import Services.ControleTelevisao;

public class TestaControle{
    public static void main(String[] args) {
        ControleTelevisao controle = new ControleTelevisao();
        controle.informacoes();
        controle.aumentarNumeroCanal();
        controle.aumentarVolume();
        controle.informacoes();
        controle.diminuirNumeroCanal();
        controle.diminuirVolume();
        controle.informacoes();
        controle.selecionarCanal(15);
        controle.informacoes();
    }

}
