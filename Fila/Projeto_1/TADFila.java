public class TADFila()
    //atributos
    int capacidade;
    int inicio;
    int fim;
    TPessoa dados[];
    
    //Construtores
    
    public TADFila(int t) {
        capacidade = t;
        inicio = -1;
        fim = -1;
        dados = new TPessoa [capacidade];
      }   
    
    //Métodos
    
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
            return ;
    }
    
    public void imprime(){
        for (int i = inicio + 1; i <= fim; i++){
            System.out.print(dados[i].nome)
        }
    }
    
    public void desmembra(TFila idoso, TFila gestante, TFila deficiente){
        
    }
    


