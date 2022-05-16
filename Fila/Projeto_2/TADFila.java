public class TADFila {

    // Atributos (= variaveis da classe)	
       int capacidade;
       int inicio;
       int fim;
       TPessoa dados[];
     
    // Construtor
       public TADFila(int t) {
         capacidade = t;
         inicio = -1;
         fim = -1;
         dados = new TPessoa [capacidade];
       }      
    
    // Métodos
     public boolean vazia () {
         return (fim == inicio);
     }
     
     public boolean cheia () {
         return (fim == capacidade -1);
     }
     
     public boolean enfileira (TPessoa p) {
         fim++;
         dados[fim] = p;
         return true;
       }
       
     public TPessoa desenfileira(){
           if (vazia() == false) {
             inicio++;
           }
         return dados[inicio];
     }
     
     public void desmembraIdade(TADFila idoso,TADFila naoidoso){
         for (int i=inicio+1; i<=fim; i++){
             TPessoa aux;
             aux = desenfileira();
             
             if (aux.getIdade() >= 60) {
             idoso.enfileira(aux);
             }
             
             else{
                 naoidoso.enfileira(aux);
             }
             
         }
     }
     
     public void imprime () {
           for (int i=inicio+1; i<=fim; i++)
               System.out.println("sexo = " + dados[i].sexo + " idade = " +  dados[i].idade + " nome = " + dados[i].nome);
         
     }
     
 }