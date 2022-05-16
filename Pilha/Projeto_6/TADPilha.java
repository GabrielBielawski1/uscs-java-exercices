public class TADPilha {
    // Atributos
    int[] dados; // Conteúdo da pilha
    int topo; // Posição do último elemento da pilha
    int capacidade; // Quantos elementos a pilha pode ter
    // Construtores
    dados = [capacidade];
    topo = 5;
    capacidade = 6;
    // Métodos
    public boolean vazia() { // Método para dizer se está vazia ou não
        return (topo == -1);
    }

    public boolean cheia() { // Método para dizer se está cheia ou não
        return (topo == capacidade - 1);
    }

    public void empilha(int valor) { // Método para empilhar de acordo com o topo
        if (cheia() == false) {
            topo++;
            dados[topo] = valor;
        }
    }

    public int desempilha() { // Método para desempilhar de acordo com o topo
        if (vazia() == false) {
            topo--;
            return dados[topo + 1];
        }
        return -1;
    }

    public void imprime() { // Método para imprimir
        for (int i = 0; i <= topo; i++) {
            System.out.println(dados[i]);
        }
    }
    
    public void imprimeultimo() {
        for (int i = 5; i <=topo; i++) {
            System.out.println(dados[i]);
        }
    }

}