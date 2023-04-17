package projeto_ex2;

public class CD extends Mídia{
    private String artista;
    private int numFaixas;
    
    public CD() {}
    
    public CD(String titulo, double tempoDeExecução,String artista, int numFaixas) {
        super(titulo, tempoDeExecução);
        this.artista = artista;
        this.numFaixas = numFaixas;
    }
    
    public String getArtista() {
        return artista;
    }
    
    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    public int getNumFaixas() {
        return numFaixas;
    }
    
    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
    
    // Polimorfismo por sobrecarga
    public void tocar() {
        System.out.println("Tocando CD " + getTitulo() + " do artista " + artista);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Artista: " + artista + ", Numero de Faixas: " + numFaixas;
    }

    @Override
    public String getTitulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
