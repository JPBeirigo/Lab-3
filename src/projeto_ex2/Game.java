package projeto_ex2;

public class Game extends Mídia {
    private int numJogadores;
    private String plataforma;
    
    public Game() {}
    
    public Game(String titulo, double tempoDeExecução, int numJogadores, String plataforma) {
        super(titulo,tempoDeExecução);
        this.numJogadores = numJogadores;
        this.plataforma = plataforma;
    }
    
    public int getNumJogadores() {
        return numJogadores;
    }
    
    public void setNumJogadores(int numJogadores) {
        this.numJogadores = numJogadores;
    }
    
    public String getPlataforma() {
        return plataforma;
    }
    
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    // Polimorfismo por sobrecarga
    public void jogar() {
        System.out.println("Jogando " + getTitulo() + " na plataforma " + plataforma);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Numero de Jogadores: " + numJogadores + ", Plataforma: " + plataforma;
    }
}