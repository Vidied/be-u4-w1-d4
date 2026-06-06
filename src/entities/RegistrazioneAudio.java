package entities;

import interfaces.Riproducibile;

public class RegistrazioneAudio extends ElementoRiproducibile {

    public RegistrazioneAudio(String titolo, int durata, int volume){
        super(titolo, durata, volume);
    }


    //Metodi per la regolazione del volume
    public void abassaVolume(int i) {
        if (getVolume() <= 0) {
            System.out.println("Volume già al minimo!");
        } else {
            int nuovoVolume = getVolume() - i;
            if (nuovoVolume < 0) {
                setVolume(0);
            } else {setVolume(nuovoVolume);}
        };

    }

    public void alzaVolume(int i) {
        if (getVolume() >= 10) {
            System.out.println("Volume al massimo!");
        } else {
            int nuovoVolume = getVolume() + i;
            if (nuovoVolume > 10) {
                setVolume(10);
            } else {setVolume(nuovoVolume);}
        }
    }

    @Override
    public void play() {
        for (int i = 0;i < getDurata(); i++ ){
            System.out.println((i +  1) + ")" + getTitolo() + " " + volumePunti());
        }
    }
}
