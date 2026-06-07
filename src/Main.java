import com.sun.jdi.VirtualMachineManager;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio audio1 = new RegistrazioneAudio("Cicciobello", 29 , 9);

        audio1.play();

        audio1.abbassaVolume(8);

        audio1.play();

        audio1.alzaVolume(20);

        audio1.play();

        Video video1 = new Video("Rickroll", 5, 2, 5);

        video1.play();

        video1.abbassaLuminosita(2);
        video1.abbassaVolume(1);

        video1.play();

        video1.alzaLuminosita(4);
        video1.alzaVolume(5);

        video1.play();

        Immagine imagine1 = new Immagine("Pikachu", 8);

        imagine1.show();

        imagine1.abbassaLuminosita(5);

        imagine1.show();

        imagine1.alzaLuminosita(4);

        imagine1.show();
    }
}