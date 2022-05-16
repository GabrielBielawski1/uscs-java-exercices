public class TPessoa {
    
    // Atributos (variaveis da classe)
       int idade;
       char sexo;
       String nome;
       
    // Construtor
       public TPessoa (int i, char s, String n){
           idade = i;
           sexo = s;
           nome = n;
           
          // System.out.println("Idade = " + i);
       }
    
    // Métodos
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int i) {
    this.idade = i;
}
}