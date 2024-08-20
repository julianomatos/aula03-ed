package exercicio1;

public class Vetor {
    private String[] elementos;
    private int posicaoAtual;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        posicaoAtual = 0;
    }

    public void inserir(String elemento){
        if(posicaoAtual < this.elementos.length){
            elementos[posicaoAtual] = elemento;
            posicaoAtual++;
        }else{
            System.out.println("Vetor cheio.");
        }
    }
    public void alterar(int indice, String elemento){
        if(indice > -1 && indice < posicaoAtual){
            elementos[indice] = elemento;
        }else{
            System.out.println("Indice inválido");
        }
    }
    public void excluir(int indice){
        //this.elementos[indice] = null;
        for(int i = indice; i < posicaoAtual; i++){
            elementos[i] = elementos[i +1];
        }
        posicaoAtual--;
    }

    public void aumentarCapacidade(){
        String[] novoVetor;
        novoVetor = new String[this.elementos.length * 2];
        for(int i = 0; i < posicaoAtual; i++){
            novoVetor[i] = this.elementos[i];
        }
        this.elementos = novoVetor;
    }

    @Override
    public String toString() {
        String str;
        str = "[";
        for(int i = 0; i < posicaoAtual; i++){

            str += elementos[i];
            if(i < posicaoAtual - 1){
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}
