package Exercicios;

public class ForDemo {
    
    public static void main(String[] args) throws Exception {
        
        int count, fator, produto;

        for(fator = 0; fator <=10; fator ++){
            System.out.println();
            for(count = 0; count <=10; count ++){
                produto = count * fator;

                System.out.println(fator + " * "+ count +" = " + produto);
                
            }
        }





           
    }
}
