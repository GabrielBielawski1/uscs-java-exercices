public class Main {
    public static void main (String[] args){
        String expressao = "3456+-*/";
        TADPilha p = new TADPilha(100);
        int casou = 1;
        for(int i =0; i< expressao.length(); i++){
                    char aux = expressao.charAt(i);
                  
                    if(aux =="+" || aux == "-" || aux == "*" || aux "/"){
                       p.empilha(aux);
                    }                
                    else if (aux == ')' || aux == ']') {
                        p.desempilha();
                    }
                    }  
        


