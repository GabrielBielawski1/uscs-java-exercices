public class TADPilha {

    int topo;
    int capacidade;
    int [] dados;

    public TADPilha (int tamanho) {
        
        capacidade = tamanho;
        topo = -1;
        dados = new int [capacidade];
    
   }
   
   
   public void imprime (){
       
        for (int i = 0; i <= topo; i++) {
            System.out.println (dados[i]);
       }
                        
    }
    
   public void empilha (int valor){
       
        topo++;
        dados[topo] = valor;
   }
                                      
   public int desempilha (){
     if(vazia()==false){
        topo = topo--;
        return dados[topo + 1];   
     }
     return -1;
   }  
                           
   public boolean vazia(){
       return(topo == -1);
    }
                       
}