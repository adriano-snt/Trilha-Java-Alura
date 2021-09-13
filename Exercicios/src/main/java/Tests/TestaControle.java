package Tests;

import Services.ControleTelevisaoService;

public class TestaControle{
    public static void main(String[] args) {
        ControleTelevisaoService controle = new ControleTelevisaoService();
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
