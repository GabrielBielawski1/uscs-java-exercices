public class Main {

    public static void main (String arg[]) {
       TPessoa p=new TPessoa (20, 'F', "Maria");
       TPessoa q=new TPessoa (60, 'F', "Marta");
       TADFila f = new TADFila (100);
       TADFila idoso = new TADFila (100);
       TADFila naoidoso = new TADFila (100);
       
        f.enfileira(p);
        f.enfileira(q);
        f.desmembraIdade(idoso, naoidoso);
        
    }
}
