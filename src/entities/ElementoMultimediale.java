package entities;

public abstract class ElementoMultimediale {

    //Attributo generale della superclasse
    private String titolo;


    public ElementoMultimediale(String titolo){
        this.titolo = titolo;
    }

    //getter e setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

}
