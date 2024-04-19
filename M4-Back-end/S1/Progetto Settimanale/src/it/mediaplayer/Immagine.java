package it.mediaplayer;

public class Immagine extends ElementoMultimediale implements MetodiVisualizzabili {

    private String titolo;

    private int luminosità;
    //RICHIAMO IL SUPER COSTRUTTORE DELLA CLASSE GENITORE E AGGIUGNO ATTRIBUTI SPECIFICI DELLA CLASSE
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
    //DEFINISCO IL METODO SHOW DIRETTAMENTE NELLA CLASSE IN QUANTO QUESTA CLASSE SARÀ L'UNICA AD UTILIZZARLO
    public void show(){

        System.out.print(getTitolo()+" Luminosità:");

        for(int i = 0; i<getLuminosità(); i++){

            System.out.print("*");

        }
        System.out.println(".");
    }
    //FACCIO OVERRIDE DEI MOTODO CREATO NELL'INTERFACCIA
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
