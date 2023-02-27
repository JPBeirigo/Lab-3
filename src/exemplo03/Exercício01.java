

//Vai refazer essa merda caralho, tá tudo errado nessa porra


package exemplo03;

import javax.swing.JOptionPane;

public class Exercício01 {
    public static void main(String[] args) {
        
        String str1 = JOptionPane.showInputDialog(
                "Insira o nome do produto: ");
        String str2 = JOptionPane.showInputDialog(
                "Insira o valor do produto: ");
       
        double preco = double.parsedouble(str2);
        
        if (preco>=50 && <200)
        {
            int desconto = 5;}
        else if (preco>=200 && < 500){
            int desconto = 6;
            }
        else if (preco>=500 && <1000){
            int desconto = 7;
            }
        else if (preco<0){
                JOptionPane.showMessageDialog(
            null,
            "Demonstração do uso da caixa de diálogo na Linguagem Java",
            "Lab.Programação III",
            JOptionPane.WARNING_MESSAGE
       );
                }
        
    }
    
}
