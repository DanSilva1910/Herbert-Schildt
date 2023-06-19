package Cap_1_4;

// public class ContEspacos {

//     public static void main(String[] args) throws java.io.IOException {
//         char key;
//         char quit = '.';

//         int numerosEspacos = 0;

//         do {
//             System.out.print("Choose a key (. to quit) and ENTER: "); // digitar qualquer tecla do teclado e " .(ponto)
//                                                                       // " para //
//             // sair
//             key = (char) System.in.read();
//             System.in.skip(key);

//             if (key == ' ') {
//                 numerosEspacos++;
//             }
//         } while (key != quit);

//         System.out.println(" Number of spaces: " + numerosEspacos);

//         System.out.println(" Quit ");

//     }

// }
// codigo revisado
import java.io.IOException;

public class ContEspacos {
    public static void main(String[] args) throws IOException {
        char key;
        char quit = '.';

        int numeroEspacos = 0;

        do {
            System.out.print("Choose a key (. to quit) and press ENTER: ");
            key = (char) System.in.read();
            System.in.skip(System.in.available());

            if (key == ' ') {
                numeroEspacos++;
            }
        } while (key != quit);

        System.out.println("Number of spaces: " + numeroEspacos);
        System.out.println("Quit");
    }
}