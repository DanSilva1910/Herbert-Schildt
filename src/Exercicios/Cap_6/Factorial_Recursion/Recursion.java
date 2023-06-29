package Cap_6.Factorial_Recursion;

import java.util.Scanner;

class Scanners {
    int scan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input in number for factorial, Press Enter: ");
        int num = sc.nextInt();
        return num;
    }
}

public class Recursion {
    public static void main(String[] args) {

        Scanners sca = new Scanners();
        int n = sca.scan();

        Factorial f = new Factorial();
        int result = f.factR(n);

        System.out.println("Fatorials using recursive method.");
        System.out.println("Factorial of " + n + " is " + result);
        System.out.println();

    }

}
