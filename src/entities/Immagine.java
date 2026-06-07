package entities;

public class Immagine extends ElementoMultimediale {

    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void abbassaLuminosita(int i){setLuminosita(getLuminosita() - i);}

    public void alzaLuminosita(int i){setLuminosita(getLuminosita() + i);}


    public String luminositaAsterischi(){
        return generaSegni("*", getLuminosita());
    }

    public void show(){
        System.out.println(getTitolo() + " " +luminositaAsterischi());
    }



    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = (luminosita < 1) ? 1 : Math.min(luminosita, 10);
    }
}
