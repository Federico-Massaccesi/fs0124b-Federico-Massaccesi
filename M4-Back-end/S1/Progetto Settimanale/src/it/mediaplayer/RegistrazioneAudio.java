package it.mediaplayer;

public class RegistrazioneAudio extends ElementoRiproducibile{
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata, volume);
    }

    @Override
    public void play(){

        for(int i = 0;i<getDurata();i++){

            System.out.print(getTitolo()+" Volume:");

            for(int y = 0 ; y< getVolume();y++){

                System.out.print("!");
            }
            System.out.println(".");
        }
    }
}
