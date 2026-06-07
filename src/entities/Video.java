package entities;

public class Video extends ElementoRiproducibile {

    //Attributo
    private int luminosita;

    //Costruttore per video
    public Video(String titolo, int durata,int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    //Metodi per la regolazione luminosità
    public void abbassaLuminosita(int i){setLuminosita(getLuminosita() - i);}

    public void alzaLuminosita(int i){setLuminosita(getLuminosita() + i);}


    public String luminositaAsterschi(){
        return generaSegni("*", getLuminosita());
    }



    //Setter e getter con funzionalità uguale a quella dell'audio per bloccare numeri non compatibili
    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = (luminosita < 1) ? 1 : Math.min(luminosita, 10);
    }

    @Override
    public void play() {
        for (int i = 0;i < getDurata(); i++ ){
            System.out.println((i +  1) + ")" + getTitolo() + " " + volumePunti() + " " + luminositaAsterschi());
    }}
}
