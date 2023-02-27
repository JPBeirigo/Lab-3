package exemplo03;

import javax.swing.JOptionPane;

public class Exercício03 {
    public static void main(String[] args) {
        double num = Double.parseDouble(
                JOptionPane.showInputDialog("Qual o numero desejado?")
            );
        for (int i=1;i<=10;i++)
        {
            double tab = num*i;
            JOptionPane.showMessageDialog(
            null,
            String.format(
            "%.0f x %d = %.0f",
            num, i, tab,
            JOptionPane.WARNING_MESSAGE)
       );
            
            /*Alternativamente
            String*
            StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(
                String.format(
                    "%d x %d = %d\n", num, i, (num*i)
                )
            );
        }
        JOptionPane.showMessageDialog(null,sb.toString());
        */
        }
    }    
        
}
