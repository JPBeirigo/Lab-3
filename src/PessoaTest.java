package Classes;

public class PessoaTest {
    public static void main(String[] args) {
        
        Pessoa cleiton = new Pessoa();
        cleiton.altura = 159;
        cleiton.peso = 67;
        
        Pessoa pessoas[] = new Pessoa[3];
        pessoas[0].nome = "Joao";
        pessoas[0].altura = 172;
        pessoas[0].peso = 70;
        
        for(Pessoa c : pessoas){
            System.out.println("Nome: "+c.nome);
            System.out.println("Altura: "+c.altura);
            System.out.println("Peso: "+c.peso);
        }
        
        
    }
}
