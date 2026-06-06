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

    //Metodo che crea una stringa contenente il numero dei puntini necessari
    public String volumePunti() {
        String volume = "";
        for (int i = 0; i < getVolume(); i++) {
            volume += "!";
        }
        return volume;
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
