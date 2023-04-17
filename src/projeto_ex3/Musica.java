package projeto_ex3;

import java.time.LocalTime;

public class Musica {
    private String titulo;
    private String artista;
    private String album;
    private LocalTime duracao;

    public Musica() {
    }

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public Musica(String titulo, String artista, String album) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
    }

    public Musica(String titulo, String artista, String album, LocalTime duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Musica: " + titulo +
                ", duração: " + duracao +
                ", artista: " + artista +
                ", álbum: " + album;
    }
}
