package it.mediaplayer;

public class Video extends ElementoRiproducibile implements MetodiVisualizzabili{

    private int luminosità;

    public Video(String titolo, int durata,int volume, int luminosità) {
        super(titolo, durata,volume);
        this.luminosità = luminosità;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
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

    @Override
    public void play(){

        for(int i = 0;i<getDurata();i++){

            System.out.print(getTitolo()+" Volume-Luminosità :");

            for(int y = 0 ; y< getVolume();y++){

                System.out.print("!");
            }
            System.out.print("-");
            for(int x = 0;x< getLuminosità();x++){

                System.out.print("*");
            }
            System.out.println(".");
        }
    }
}
