package exemplo02;

/**
 *
 * @author 837199
 */
public class Conversor {
    
    public static void main (String[] args){
        
        String a = "10";
        String b = "20";
        String c = a+b ;
        System.out.println(c);
        
        //Converter as variáveis para o tipo int
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = x+y;
        
        System.out.println(z);
        
        //Converter as variáveis para o tipo Double
        double i = Double.parseDouble(a);
        double j = Double.parseDouble(b);
        double k = i+j;
        System.out.println(k);
        
        //Converter uma variável numérica para String
        String s = String.valueOf(k);
        System.out.println(s);
        
    }
    
}
