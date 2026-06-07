package entities;

import interfaces.Riproducibile;

public class RegistrazioneAudio extends ElementoRiproducibile {

    public RegistrazioneAudio(String titolo, int durata, int volume){
        super(titolo, durata, volume);
    }


    //Metodi per la regolazione del volume
    public void abbassaVolume(int i) {
   setVolume(getVolume() - i);
    }

    public void alzaVolume(int i) {
     setVolume(getVolume() + i);
    }

    public String volumePunti(){
        return generaSegni("!", getVolume());
    }

    @Override
    public void play() {
        for (int i = 0;i < getDurata(); i++ ){
            System.out.println((i +  1) + ")" + getTitolo() + " " + volumePunti());
        }
    }
}
