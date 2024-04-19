import it.mediaplayer.ElementoMultimediale;
import it.mediaplayer.Immagine;
import it.mediaplayer.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Immagine img1 = new Immagine ("Immagine 1",7);

    img1.show();

        Video vid1 = new Video("Video 1",3,5,12);

        vid1.play();
    }




}