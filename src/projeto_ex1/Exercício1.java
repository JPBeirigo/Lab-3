package projeto_ex1;

import javax.swing.JOptionPane;

public class Exercício1 {
        public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        String resposta;

        do {
            double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do aluno (em metros):"));
            
            double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso do aluno (em kg):"));

            if (altura < 1.50) {
                a++;
                if (peso > 100) {
                    d++;
                }
            }

            if (peso > 90) {
                b++;
            }
            
            if (altura > 1.80 || peso>100) {
                c++;
            }

            resposta = JOptionPane.showInputDialog(null, "Deseja continuar? (S/N)").toUpperCase();
        } while (!resposta.equals("N"));

        String mensagem = "Quantidade de alunos com altura inferior a 1.50m: " + a + "\n" +
                          "Quantidade de alunos com peso superior a 90kg: " + b + "\n" +
                          "Quantidade de alunos com peso inferior a 50kg e altura superior a 1.80m: " + c + "\n" +
                          "Quantidade de alunos com altura inferior a 1.50m e peso superior a 100kg: " + d;

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
 