// Scanner scanner = new Scanner(System.in);
// int numeroInteiro = scanner.nextInt();
// byte numeroByte = scanner.nextByte();
// long numeroLong = scanner.nextLong();
// boolean booleano = scanner.nextBoolean();
// float numeroFloat = scanner.nextFloat();
// double numeroDouble = scanner.nextDouble();


package Cap_5;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class PhoneNumber {

    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        System.out.print("\n Enter the desired name: ");
        String name = entrada.next();

        String namePhone[][] = {
                { "Tom", "555-3322" },
                { "Mary", "555-89876" },
                { "Jon", "555-10374" },
                { "Rachel", "555-1400" },
                { "Dan", "555-2411" }
        };

       int i;

        for (i = 0; i < namePhone.length; i++) {
            if (namePhone[i][0].equalsIgnoreCase(name)) {
                System.out.println("\n" + namePhone[i][0] + ": " + namePhone[i][1] + "\n");
                break;
            }
        }
        if (i == namePhone.length)
            System.out.println("Name not found \n");

    }
}
