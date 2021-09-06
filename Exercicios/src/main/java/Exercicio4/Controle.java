package Exercicio4;

public class Controle extends Televisao{

    public void aumentarVolume(){
        if(super.volume < 100){
            super.volume++;
        }
    }

    public void diminuirVolume(){
        if(super.volume > 0){
            super.volume--;
        }
    }

    public void aumentarNumeroCanal(){
        if(super.canal < 20){
            super.canal++;
        }
    }

    public void diminuirNumeroCanal(){
        if(super.canal > 1){
            super.canal--;
        }
    }

    public int selecionarCanal(int canalSelecionado){
        if (canalSelecionado > 1 && canalSelecionado <=20){
            super.canal = canalSelecionado;
        }
        return super.canal;
    }

    public void informacoes(){
        System.out.println("Volume: " + super.volume + " Canal: " + super.canal);
    }
}
