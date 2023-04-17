package projeto_ex2;

public class TesteMídia {
    public static void main(String[] args) {
    // Polimorfismo por generalizacao
    Mídia m1 = new CD("Post Human: Survival Horror",32.10, "Bring Me The Horizon", 9);
    Mídia m2 = new Video("Suzume", 120.6, "Makoto Shinkai");
    Mídia m3 = new Game("Elden Ring", 40.0, 1, "Xbox One Series X");
    
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
    }
}
