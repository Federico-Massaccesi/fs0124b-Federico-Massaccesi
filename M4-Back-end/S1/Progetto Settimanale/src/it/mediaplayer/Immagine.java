package it.mediaplayer;

public class Immagine extends ElementoMultimediale implements MetodiVisualizzabili {

    private String titolo;

    private int luminosità;

    public Immagine(String titolo,int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    public void show(){

        System.out.print(getTitolo()+" Luminosità:");

        for(int i = 0; i<getLuminosità(); i++){

            System.out.print("*");

        }
        System.out.println(".");
    }

    @Override
    public void aumentaLuminosità() {
    if(getLuminosità()<100){
        setLuminosità(getLuminosità()+1);
    }else{
        System.out.println("Luminosità al massimo");
    }

    }

    @Override
    public void diminuisciLuminosità() {
        if (getLuminosità() > 0) {
            setLuminosità(getLuminosità() - 1);
        } else {
            System.out.println("Luminosità già al minimo");
        }
    }
}
