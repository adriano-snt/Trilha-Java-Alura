package Exercicio4;
/*
Crie uma classe Televisão e uma classe Controle Remoto que pode controlar o volume e trocar os canais da televisão.
O controle permite:
  (x)Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
  (x)Aumentar e diminuir o número do canal em uma unidade.
  (x)Trocar para um canal indicado;
  ()Consultaro valor do volume de som e o canal selecionado.
 */

public class Televisao {
    protected int volume;
    protected int canal;

    public Televisao(){
        this.canal = 1;
        this.volume = 30;
    }

    public int getVolume() {
        return volume;
    }
}
