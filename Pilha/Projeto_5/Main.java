public class Main {
    public static void main (String[] args) {
        
        //1. CRIAR UMA EXPRESSÃƒO MATEMÁICA
        String expressao = "(3+5)-6";
        
        //2. Verificar se a expressão é bem formada
    TADPilha p = new TADPilha(100);
        int casou = 1;          
              for(int i =0; i< expressao.length(); i++){
                char aux = expressao.charAt(i);
                // Varrer a expressão. Se encontrar ( ou [ empilhe. Se ) ou ] desempilhe
                if(aux =='[' || aux == '('){
                   p.empilha(aux);
                }                
                else if (aux == ')' || aux == ']') {
                    p.desempilha();
                }
                //No final, se a pilha estiver vazia, a expressão é bem formada (aux=1)
                }  

        //3. Emitir mensagem informando se a expressão é bem formada ou não
        
    }


}
