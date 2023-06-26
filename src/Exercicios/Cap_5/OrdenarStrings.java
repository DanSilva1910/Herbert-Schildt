package Cap_5;


import java.util.Arrays;

public class OrdenarStrings {
    public static void main(String[] args) {
        String[] palavras = { "banana", "abacaxi", "laranja", "uva", "manga" };

        // Classificar o array em ordem alfabética
        Arrays.sort(palavras);

        // Imprimir o array ordenado
        System.out.println("Array de palavras ordenado:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}


