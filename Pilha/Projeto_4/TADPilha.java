public class TADPilha
    {
    //Atributos 
    int []dados; //Conteúdo da pilha
    int topo; //Posição do último elemento da pilha
    int capacidade; //Quantos elementos a pilha pode ter 
    //Construtores
    public TADPilha(int t){
        dados = new int [t];
        topo = -1;
        capacidade = t;
    }
    //Métodos
    public boolean vazia() { //Método para dizer se está vazia ou não
        return (topo == -1);
    }
    
    public boolean cheia() {    //Método para dizer se está cheia ou não
        return (topo == capacidade - 1);
    }
    
    public void empilha(int valor){ //Método para empilhar de acordo com o topo
       if (cheia() == false) {
            topo++;
            dados[topo] = valor; 
        }
    }
    
    public int desempilha(){    //Método para desempilhar de acordo com o topo
        if (vazia() == false) {
            topo--;
            return dados[topo+1];
        }
        return -1;
    }
    public void binario(){  //Método para converter um numero decimal em binario
        int binario = 2;
        while(binario > 0){
            if(binario != 0){
                empilha(binario % 2);
                binario = binario/2;
            }
        }
        imprime2();
    }    
    public void imprime (){ //Método para imprimir
        for(int i=0; i <= topo; i++){
             System.out.println(dados[i]);
        }
    }
        
    public void imprime2 (){    //Método para imprimir ao contrario
        for (int i = topo; i>=0; i--){
            System.out.print(dados[i]);
        }
    }
}