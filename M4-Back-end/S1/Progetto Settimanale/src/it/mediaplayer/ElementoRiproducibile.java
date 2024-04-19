package it.mediaplayer;

public class ElementoRiproducibile extends ElementoMultimediale implements MetodiRiproducibili{
//CLASSE ASTRATTA GENITORE DI AUDIO E VIDEO PER PASSARE ATTRIBUTI E METODI CONDIVISI DAI FIGLI
    private int durata;

    private int volume;

    //IL TITOLO VIENE RIPRESO DAL COSTRUTTORE DEL GENITORE ATTRAVERSO IL SUPERCOSTRUTTORE
    public ElementoRiproducibile(String titolo,int durata,int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
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
        this.volume = volume;
    }

    //RICHIAMO IL METODO PLAY DALL'INTERFACCIA PER POI USARLO NEI FIGLI
    @Override
    public void play() {

    }
    //DEFINISCO I METODI IN QUANTO SARANNO GLI STESSI NELLE CLASSI FIGLIE
    @Override
    public void abbassaVolume() {
    setVolume(getVolume()-1);
    }

    @Override
    public void alzaVolume() {
    setVolume(getVolume()+1);
    }
}
