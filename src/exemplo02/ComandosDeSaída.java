package exemplo02;

import javax.swing.JOptionPane;

/**
 *
 * @author 837199
 */
public class ComandosDeSaída {
    
    public static void main (String[] args){
        
        System.out.print("Segunda\n");
        System.out.print("Terça\n");
        
       JOptionPane.showMessageDialog(
            null,
               "Programando em Java!"
                );
       
       JOptionPane.showMessageDialog(
            null,
            "Demonstração do uso da caixa de diálogo na Linguagem Java",
            "Lab.Programação III",
            JOptionPane.WARNING_MESSAGE
       );
    }
}
