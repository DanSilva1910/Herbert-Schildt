package Exercicios;

public class logicalOpTable {

    public static void main(String[] args) {
        
       int p, q, s;
    



        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

          
                p = 1; q = 1 ;s = 1;
                s = ( p == 1 ? 0 : 1 );
             

                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (s)+ "\t");

                p = 1; q = 0;
                s = ( p == 1 ? 0 : 1 );
                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (s)+ "\t");

                p = 0; q = 1;
                s = ( p == 1 ? 0 : 1 );
                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (s)+ "\t");

                p = 0; q = 0;
                s = ( p == 1 ? 0 : 1 );
                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (s)+ "\t");



    }
    
}
