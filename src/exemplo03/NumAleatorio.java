/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo03;

import javax.swing.JOptionPane;

/**
 *
 * @author 837199
 */
public class NumAleatorio {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Números sorteados").append("\n");
        
        int soma=0;
        for (int i = 1; i<=3; i++){
            int jogada = (int) (Math.random()*6)+1;
            soma += jogada;
            
            sb.append(String.format("Jogada %d = %d\n", i, jogada));
        }
        sb.append("Total = ").append(soma);
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
