package Objects;

public class Televisao {
    private int volume;
    private int canal;

    public Televisao(int volume, int canal){
       setVolume(volume);
       setCanal(canal);
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
}

