public class NumerosPrimos {
 
    public static void main(String[] args) {
        int inicio, fim, primo=0;
         inicio = 2;
         fim = 100;


        for (int i=inicio; i<=fim; i++) {
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println("O número " + i + " é PRIMO!");
            }
            primo = 0;
        }

    }
}
    