
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] playlist = new ElementoMultimediale[5];

        System.out.println("Inserisci i dati per i 5 elementi da aggiugere in lista!");

        for (int i = 0; i < playlist.length; i++) {
            System.out.println("Elemento numero: " + (i +1));

            System.out.println("Scegli la tipologia di elemento da aggiugnere scrivendo 1 (audio), 2 (video) oppure 3 (immagine)");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Scrivi il titolo dell'elemento");
            String titolo = scanner.nextLine();

            switch (scelta){
                case 1:
                    System.out.println("Inserisci la durata dell'audio");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume (0-10)");
                    int volumeAudio = scanner.nextInt();
                    playlist[i] = new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;

                case 2:
                    System.out.println("Inserisci la durata del video");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume (0-10)");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità del video (1-10)");
                    int luminositaVideo = scanner.nextInt();
                    playlist[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;

                case 3:
                    System.out.println("Inserisci la luminosità dell'immagine");
                    int luminositaImmagine = scanner.nextInt();
                    playlist[i] = new Immagine(titolo, luminositaImmagine);
                    break;

                default:
                    System.out.println("Valore non valido! Ripetere");
                    i--;
            }
        }

        int sceltaFile = -1;

        while (sceltaFile != 0) {
            System.out.println("Scegli un file da riprodurre 1-5 oppure 0 per uscire dal player");
            for (int i = 0; i < playlist.length; i++) {
                System.out.println((i + 1) + ")" + playlist[i].getTitolo());
            }
            sceltaFile = scanner.nextInt();
            scanner.nextLine();

            if (sceltaFile > 0 && sceltaFile <= 5){
                ElementoMultimediale file = playlist[sceltaFile - 1];

                if (file instanceof Video) {
                    ((Video) file).play();
                } else if (file instanceof RegistrazioneAudio) {
                    ((RegistrazioneAudio) file).play();
                } else if(file instanceof Immagine) {
                    ((Immagine) file).show();
                }
            } else if (sceltaFile != 0) {
                System.out.println("Numero non valido!");
            }

        }
        System.out.println("Player chiuso!");







//        RegistrazioneAudio audio1 = new RegistrazioneAudio("Cicciobello", 29 , 9);
//
//        audio1.play();
//
//        audio1.abbassaVolume(8);
//
//        audio1.play();
//
//        audio1.alzaVolume(20);
//
//        audio1.play();
//
//        Video video1 = new Video("Rickroll", 5, 2, 5);
//
//        video1.play();
//
//        video1.abbassaLuminosita(2);
//        video1.abbassaVolume(1);
//
//        video1.play();
//
//        video1.alzaLuminosita(4);
//        video1.alzaVolume(5);
//
//        video1.play();
//
//        Immagine imagine1 = new Immagine("Pikachu", 8);
//
//        imagine1.show();
//
//        imagine1.abbassaLuminosita(5);
//
//        imagine1.show();
//
//        imagine1.alzaLuminosita(4);
//
//        imagine1.show();
    }
}