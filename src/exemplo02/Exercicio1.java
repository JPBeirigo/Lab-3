package exemplo02;

public class Exercicio1 {
    
    public static void main ( String[] args) {
        
        double a = 6.5;
        double b = 7.0;
        double c = (a*0.4)+(b*0.6);
        System.out.println("Média final: " + c);
        
        System.out.println(
            String.format("\nMédia Final: %.1f", c)
        );
        
    }
}
