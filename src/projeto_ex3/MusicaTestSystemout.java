package projeto_ex3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MusicaTestSystemout {

   public static void main(String[] args) {
        List<Musica> lista = new ArrayList<>();

        Musica musica1 = new Musica("Shape of You", "Ed Sheeran", "÷ (Divide)", LocalTime.of(0, 3, 53));
        lista.add(musica1);

        Musica musica2 = new Musica("Bohemian Rhapsody", "Queen", "A Night at the Opera", LocalTime.of(0, 5, 55));
        lista.add(musica2);

        Musica musica3 = new Musica("Smells Like Teen Spirit", "Nirvana", "Nevermind", LocalTime.of(0, 5, 1));
        lista.add(musica3);

        Musica musica4 = new Musica("Billie Jean", "Michael Jackson", "Thriller", LocalTime.of(0, 4, 54));
        lista.add(musica4);

        Musica musica5 = new Musica("Stairway to Heaven", "Led Zeppelin", "Led Zeppelin IV", LocalTime.of(0, 8, 2));
        lista.add(musica5);

        for (Musica musica : lista) {
            System.out.println(musica.toString());
        }
    }
}


