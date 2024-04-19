package it.mediaplayer;

public class ElementoRiproducibile extends ElementoMultimediale implements MetodiRiproducibili{

    private int durata;

    private int volume;

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


    @Override
    public void play() {

    }

    @Override
    public void abbassaVolume() {
    setVolume(getVolume()-1);
    }

    @Override
    public void alzaVolume() {
    setVolume(getVolume()+1);
    }
}
