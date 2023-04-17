package projeto_ex3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MusicaTest {

    public static void main(String[] args) {

        // Criando a lista de músicas
        List<Musica> lista = new ArrayList<>();
        lista.add(new Musica("Stairway to Heaven", "Led Zeppelin", "Led Zeppelin IV", LocalTime.of(8, 2)));
        lista.add(new Musica("Bohemian Rhapsody", "Queen", "A Night at the Opera", LocalTime.of(5, 55)));
        lista.add(new Musica("Hotel California", "Eagles", "Hotel California", LocalTime.of(6, 30)));
        lista.add(new Musica("Purple Haze", "Jimi Hendrix", "Are You Experienced", LocalTime.of(2, 50)));
        lista.add(new Musica("Smells Like Teen Spirit", "Nirvana", "Nevermind", LocalTime.of(5, 1)));

        // Criando uma String para armazenar as informações das músicas
        StringBuilder sb = new StringBuilder();
        for (Musica musica : lista) {
            sb.append(musica.toString()).append("\n");
        }

        // Exibindo a lista de músicas em uma janela de diálogo
        JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Músicas", JOptionPane.INFORMATION_MESSAGE);
    }
}
