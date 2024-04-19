import it.mediaplayer.ElementoMultimediale;
import it.mediaplayer.Immagine;
import it.mediaplayer.RegistrazioneAudio;
import it.mediaplayer.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//TEST CLASSE E METODI IMMAGINE
    Immagine img1 = new Immagine ("Immagine 1",7);

    img1.show();
//TEST CLASSE E METODI VIDEO
        Video vid1 = new Video("Video 1",6,0,2);

        vid1.diminuisciLuminosità();
        vid1.alzaVolume();

        vid1.play();
//TEST CLASSE E METODI AUDIO
        RegistrazioneAudio audio1 = new RegistrazioneAudio("Audio 1",3,2);

        audio1.alzaVolume();

        audio1.play();
    }




}