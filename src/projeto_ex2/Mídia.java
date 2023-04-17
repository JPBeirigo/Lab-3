package projeto_ex2;

public class Mídia {
    protected String titulo;
    protected double tempoDeExecução;
    
    public Mídia() {}
    
    public Mídia(String titulo, double tempoDeExecução) {
        this.titulo = titulo;
        this.tempoDeExecução = tempoDeExecução;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public double getTempoDeExecução() {
        return tempoDeExecução;
    }
    
    public void setTempoDeExecução(double tempoDeExecução) {
        this.tempoDeExecução = tempoDeExecução;
    }
    
    public int getDuracaoSegundos() {
        return (int) (tempoDeExecução * 60);
    }
    
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Duracao: " + tempoDeExecução + " minutos";
    }
}
