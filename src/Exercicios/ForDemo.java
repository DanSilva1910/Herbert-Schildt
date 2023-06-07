package Exercicios;

public class ForDemo {
    
    public static void main(String[] args) throws Exception {

        int iresul, irem, x, y;

        double dresul, drem;

        iresul = 10 / 3;
        irem = 10 % 3;

        
        dresul = 10.0/ 3.0;
        drem = 10.0 % 3.0;

        x = 10;
        y = ++x;
        System.out.println(y + " " + x);
        y = y;
        System.out.println(y);
        

        x = 10;
        y = x++;
        System.out.println(y + " " + x);
        y = y ;
        System.out.println(y);
                
    }
}
