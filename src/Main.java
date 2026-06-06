import entities.RegistrazioneAudio;

public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio audio1 = new RegistrazioneAudio("Cicciobello", 29 , 9);

        audio1.play();

        audio1.abbassaVolume(8);

        audio1.play();

        audio1.alzaVolume(20);

        audio1.play();
    }
}