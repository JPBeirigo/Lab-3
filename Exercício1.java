package projeto;

import javax.swing.JOptionPane;

public class Exercício1 {
    public static void main(String[] args) {
        int cont = 1;
        int a =0;   //Altura superior a 1,5m.
        int b = 0;  //Peso superior a 90Kg.
        int c = 0;  //Peso inferior a 50kg e altura superior a 1.80m.
        int d = 0;  //Peso superior a 100kg e altura inferior a 1.50m.
        do{                       
            
            double alt = Double.parseDouble(JOptionPane.showInputDialog(
            "Insira a altura do(a) aluno(a)em metros: "));
                
            double peso = Double.parseDouble(JOptionPane.showInputDialog(
            "Insira o peso do(a) aluno(a) em Kgs: ")); 
            
            if (alt<1.50)
            {
                a++;
            }
            else if (peso>90)
            {
                b++;
            }
            else if (peso<50 && alt>1.80)
            {
                c++;
            }
            else if (peso>100 && alt<1.50)
            {
                d++;
                a++;
                b++;
            }
            
            
            String resp = JOptionPane.showInputDialog(
                "Deseja inserir outro aluno? \nS/N");
            if (!"n".equals(resp) && !"N".equals(resp))
            {
                cont = 1;
            }
            else
            {
                cont =0;
            }
        }while(cont == 1);
        
        //Converter inteiros para string
        String s = String.valueOf(a);
        String s2 = String.valueOf(b);
        String s3 = String.valueOf(c);
        String s4 = String.valueOf(d);
        
        String message = String.format("Dos alunos registrados \n%s deles possuem menos que 1,50m de altura\n%s possuem mais que 90Kgs\n%s possuem menos que 50Kgs e mais que 1,80m de altura\n%s possuem mais que 100Kgs e menos que 1,50m de altura", s, s2, s3, s4);
        JOptionPane.showMessageDialog(null, message, "Estatísticas dos alunos", JOptionPane.PLAIN_MESSAGE);
    }
}
