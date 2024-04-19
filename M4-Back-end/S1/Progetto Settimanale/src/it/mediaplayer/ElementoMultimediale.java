package it.mediaplayer;

public abstract class ElementoMultimediale {
//CLASSE ASTRATTA GENITORE CHE PASSA AI SUOI FIGLI IL TITOLO CHE RISULTA L'UNICO ATTRIBUTO COMUNE

    private String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
