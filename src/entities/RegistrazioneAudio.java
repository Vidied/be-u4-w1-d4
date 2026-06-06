package entities;

import interfaces.Riproducibile;

public class RegistrazioneAudio extends ElementoRiproducibile {

    public RegistrazioneAudio(String titolo, int durata, int volume){
        super(titolo, durata, volume);
    }


    //Metodi per la regolazione del volume
    public void abassaVolume() {
        if (getVolume() <= 0) {
            System.out.println("Volume già al minimo!");
        } else {setVolume(getVolume() - 1);};

    }

    public void alzaVolume() {
        if (getVolume() >= 10) {
            System.out.println("Volume al massimo!");
        } else {setVolume(getVolume() + 1);}
    }

    @Override
    public void play() {
        for (int i = 0;i < getDurata(); i++ ){
            System.out.println((i +  1) + ")" + getTitolo() + volumePunti());
        }
    }
}
