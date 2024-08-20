package exercicio1;

public class Teste {
    public static void main(String[] args) {
        Vetor frutas = new Vetor(2);
        frutas.inserir("Maçã");
        frutas.inserir("Abacaxi");
        frutas.aumentarCapacidade();
        frutas.inserir("Kiwi");
        frutas.alterar(3, "Melancia");
        frutas.excluir(0);
        frutas.inserir("Abacate");
        System.out.println(frutas);
    }
}
