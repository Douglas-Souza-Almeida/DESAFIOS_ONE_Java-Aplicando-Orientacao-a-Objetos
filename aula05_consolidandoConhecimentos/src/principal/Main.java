package principal;

import models.Musica;
import models.Podcast;
import models.Preferidas;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.setTitulo("Nightrain");
        musica.setArtista("Guns n' Roses");

        for (int i = 0; i < 1000 ; i++) {
            musica.reproduz();

        }

        for (int i = 0; i < 50 ; i++) {
            musica.curti();

        }

        Podcast podcast = new Podcast();

        podcast.setTitulo("Dev Java");
        podcast.setApresentador("Douglas");

        for (int i = 0; i < 1000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curti();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);
    }
}
