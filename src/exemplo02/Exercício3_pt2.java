package exemplo02;

import javax.swing.JOptionPane;

public class Exercício3_pt2 {
   
    public static void main(String[] args) {
        String str1 = JOptionPane.showInputDialog(
            "Informe o valor da base");
                
        String str2 = JOptionPane.showInputDialog(
            "Informe o valor da altura");
        
        double soma = Double.parseDouble(str1)*
                      Double.parseDouble(str2);
        double area2 = soma/2;
        
        JOptionPane.showMessageDialog(
                null,
                "A área do triângulo é de: " + area2,
                "Triângulo",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
