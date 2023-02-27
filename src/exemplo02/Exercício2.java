package exemplo02;

import javax.swing.JOptionPane;

public class Exercício2 {
    
    public static void main (String[] args) {
        String nome = "João da Silva";
        double altura = 1.95;
        double peso = 92.58;
        double imc = altura/(peso*peso); //Função de potência "Math.pow(variavel,expoente)"
        
        JOptionPane.showMessageDialog(
            null,
            "Valor de seu IMC: " + imc,
            nome,
            JOptionPane.WARNING_MESSAGE);
        
    }
}
