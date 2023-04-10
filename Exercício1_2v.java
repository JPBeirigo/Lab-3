package projeto;

import java.util.Scanner;

public class Exercício1_2v {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countAlturaBaixa = 0;
        int countPesoAlto = 0;
        int countAlturaAltaPesoBaixo = 0;
        int countAlturaBaixaPesoAlto = 0;
        
        do {
            System.out.print("Informe a altura do aluno em metros: ");
            double altura = scanner.nextDouble();
            
            System.out.print("Informe o peso do aluno em kg: ");
            double peso = scanner.nextDouble();
            
            if (altura < 1.50) {
                countAlturaBaixa++;
            }
            
            if (peso > 90) {
                countPesoAlto++;
            }
            
            if (peso < 50 && altura > 1.80) {
                countAlturaAltaPesoBaixo++;
            }
            
            if (peso > 100 && altura < 1.50) {
                countAlturaBaixaPesoAlto++;
            }
            
            System.out.print("Deseja continuar (S,N)? ");
        } while (scanner.next().equalsIgnoreCase("S"));
        
        System.out.println("Quantidade de alunos com altura inferior a 1.50m: " + countAlturaBaixa);
        System.out.println("Quantidade de alunos com peso superior a 90kg: " + countPesoAlto);
        System.out.println("Quantidade de alunos com peso inferior a 50kg e altura superior a 1.80m: " + countAlturaAltaPesoBaixo);
        System.out.println("Quantidade de alunos com peso superior a 100kg e altura inferior a 1.50m: " + countAlturaBaixaPesoAlto);
    }
    
}