package Exercicio4;

public class Controle extends Televisao{

    public void aumentarVolume(){
        if(super.getVolume() < 100){
            super.setVolume(super.getVolume() + 1);
        }
    }

    public void diminuirVolume(){
        if(super.getVolume() > 0){
            super.setVolume(super.getVolume() - 1);
        }
    }

    public void aumentarNumeroCanal(){
        if(super.getCanal() < 20){
            super.setCanal(super.getCanal() + 1);
        }
    }

    public void diminuirNumeroCanal(){
        if(super.getCanal() > 1){
            super.setCanal(super.getCanal() - 1);
        }
    }

    public int selecionarCanal(int canalSelecionado){
        if (canalSelecionado > 1 && canalSelecionado <=20){
            super.setCanal(canalSelecionado);
        }
        return super.getCanal();
    }

    public void informacoes(){
        System.out.println("Volume: " + getVolume() + " Canal: " + getCanal() );
    }
}
