package exemplo03;

import javax.swing.JOptionPane;

public class Exercício03_Prof {
    
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Informe um número"
            )
        );
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(
                String.format(
                    "%d x %d = %d\n", num, i, (num*i)
                )
            );
        }
        JOptionPane.showMessageDialog(null,sb.toString());
    }
    
    
}
