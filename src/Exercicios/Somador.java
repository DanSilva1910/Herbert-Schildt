package Exercicios;

public class Somador {
    public static void main(String[] args) {
        int contador, soma = 0;


        for(contador = 1; contador <= 5 ; soma += contador++ ){
            System.out.println(soma);
        }

        System.out.println(soma);

    }
}
