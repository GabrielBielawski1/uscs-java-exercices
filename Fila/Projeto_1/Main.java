public class Main () 
    public static void main (String arg[]){
       TPessoa p = new TPessoa (20, 'F', "Maria");
       TPessoa q = new TPessoa (10, 'F', "Marta");
       TADFila f = new TADFila (100);
       
       f.enfileira (p);
       f.enfileira (q); 

       f.imprime();
        
        
        
    }
