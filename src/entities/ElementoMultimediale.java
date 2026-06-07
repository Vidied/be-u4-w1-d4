package entities;

public abstract class ElementoMultimediale {

    //Attributo generale della superclasse
    private String titolo;

    public ElementoMultimediale(String titolo){
        this.titolo = titolo;
    }

    //Metodo che crea una stringa contenente il numero dei puntini necessari
    public String generaSegni(String segno, int volte) {
        String volume = "";
        for (int i = 0; i < volte; i++) {
            volume += segno;
        }
        return volume;
    }

    //getter e setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

}
