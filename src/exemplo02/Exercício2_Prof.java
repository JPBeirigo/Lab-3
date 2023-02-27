package exemplo02;

import javax.swing.JOptionPane;

public class Exercício2_Prof {
    
    public static void main(String[] args){
        
        String nome = "João da Silva";
        double altura = 1.95;
        double peso = 92.58;
        double imc = peso/Math.pow(altura,2);
        
        JOptionPane.showMessageDialog(
            null,
            String.format("%s tem IMC igual a %.2f",nome,imc)
        );
    }
    
}