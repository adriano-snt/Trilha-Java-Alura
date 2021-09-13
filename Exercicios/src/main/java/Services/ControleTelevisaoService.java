package Services;

import Objects.Televisao;

public class ControleTelevisaoService {
    static int volumeMaximo = 100;
    static int volumeMinimo = 0;
    static int menorCanal = 1;
    static int maiorCanal = 20;
    static int unidadeDeVolume = 1;
    static int unidadeDeCanal = 1;

    private Televisao televisao = new Televisao(volumeMinimo, menorCanal);

    public void aumentarVolume() {
        if (televisao.getVolume() < volumeMaximo) televisao.setVolume(televisao.getVolume() + unidadeDeVolume);
    }


    public void diminuirVolume() {
        if (televisao.getVolume() > volumeMinimo) televisao.setVolume(televisao.getVolume() - unidadeDeVolume);
    }


    public void aumentarNumeroCanal() {
        if (televisao.getCanal() < maiorCanal) televisao.setCanal(televisao.getCanal() + unidadeDeCanal);
    }


    public void diminuirNumeroCanal() {
        if (televisao.getCanal() > menorCanal) televisao.setCanal(televisao.getCanal() - unidadeDeCanal);
    }


    public void selecionarCanal(int canalSelecionado) {
        if (canalSelecionado > menorCanal && canalSelecionado <= maiorCanal) televisao.setCanal(canalSelecionado);
    }


    public void informacoes() {
        System.out.println("Volume: " + televisao.getVolume() + " Canal: " + televisao.getCanal());
    }
}
