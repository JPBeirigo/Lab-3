package projeto_ex2;

public class Video extends Mídia{
    private String diretor;
    
    public Video() {}
    
    public Video(String titulo, double tempoDeExecução, String diretor) {
        super(titulo, tempoDeExecução);
        this.diretor = diretor;
    }
    
    public void tocar() {
    System.out.println("Tocando vídeo " + getTitulo() + " dirigido por " + diretor);
    }
    
    public String getDiretor() {
        return diretor;
    }
    
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
    // Polimorfismo por sobreposicao
    @Override
    public String toString() {
        return super.toString() + ", Diretor: " + diretor;
    }
}
