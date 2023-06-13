package Exercicios;

public class ForArbitrario {
    public static void main(String[] args) {
        int valorInicial = 2;
        int quantidadeElementos = 10;

        for (int i = 0, valorAtual = valorInicial; i < quantidadeElementos; i++, valorAtual *= 2) {
            System.out.println(valorAtual);
        }
    }

}
