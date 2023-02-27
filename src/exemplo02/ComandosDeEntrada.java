package exemplo02;

import java.util.Scanner;

public class ComandosDeEntrada {
    
    public static void main(String[] args) {
        
        //entrada de dados
        Scanner entrada = new Scanner(System.in); 
        
        System.out.print("Informe o primeiro valor: ");
        int valor1 = entrada.nextInt();
        
        System.out.print("Informe o segundo valor: ");
        int valor2 = entrada.nextInt();
        
        System.out.println("Soma = " + (valor1+valor2));
    }
}
