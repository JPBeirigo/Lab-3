package exemplo02;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercício3 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print ("Informe o valor da base: ");
        double base = entrada.nextDouble();
        
        System.out.print ("Informe o valor da altura: ");
        double altura = entrada.nextDouble();
        
        double area = (base*altura)/2;
        System.out.println("A área do triangulo é de: " + area);
        

    }
}
