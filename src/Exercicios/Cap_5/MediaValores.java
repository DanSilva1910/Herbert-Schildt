package Cap_5;

// public class MediaValores {
//     public static void main(String[] args) {
//         int valores [] ={ 
//             10, 5, 8, 115, 225, 235, 50, 89, 584, 1254
//         };
//         int size = valores.length;

//         int sum = 0;
//         double mediaValores = 0 ;

//         for ( int i : valores ){
//           sum += i;
//           mediaValores =(double) sum / size;

//         }
//         System.out.println(" A média dos valores é : " + mediaValores );
//     }

// }

public class MediaValores {
    public static void main(String[] args) {
        int[] valores = { 10, 5, 8, 115, 225, 235, 50, 89, 584, 1254 };

        // método para calcular a média
        double media = calcularMedia(valores);
        
        System.out.println("A média dos valores é: " + media);
    }

    public static double calcularMedia(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }

        int soma = 0;

        // laço for-each usado para decorrer o array 
        for (int valor : array) {
            soma += valor;
        }
        
        // calculo da soma converção explícita para ponto flutuante
        return (double) soma / array.length;
    }
}

