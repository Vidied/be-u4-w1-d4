package entities;

import interfaces.Riproducibile;

public abstract class ElementoRiproducibile extends ElementoMultimediale implements Riproducibile {

    //Attributi per la sottoclasse che accumuna sia video che audio essendo delle classi riproducibili con durata e volume
    private int durata;
    private int volume;

    public ElementoRiproducibile(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
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



    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = (volume < 0) ? 0 : Math.min(volume, 10);
    }
}
