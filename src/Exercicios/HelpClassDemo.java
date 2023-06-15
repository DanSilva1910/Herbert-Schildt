// package Exercicios;

// class Help {

//     void helpOn(int what) {
//         switch (what) {
//             case '1':
//                 System.out.println("The if:\n");
//                 System.out.println("if (condition) statement;");
//                 System.out.println("else statement;\n");
//                 break;

//             case '2':
//                 System.out.println("The switch:\n");
//                 System.out.println("switch (expression) {");
//                 System.out.println("    case constant:");
//                 System.out.println("        statement sequence");
//                 System.out.println("        break;");
//                 System.out.println("    //...");
//                 System.out.println("}\n");
//                 break;

//             case '3':
//                 System.out.println("The for:\n");
//                 System.out.println("for (init; condition; iteration)");
//                 System.out.println("    statement\n");
//                 break;

//             case '4':
//                 System.out.println("The while:\n");
//                 System.out.println("while (condition) statement;\n");
//                 break;

//             case '5':
//                 System.out.println("The do-while:\n");
//                 System.out.println("do {");
//                 System.out.println("    statement;");
//                 System.out.println("} while (condition);\n");
//                 break;
//         }
//         System.out.println();
//     }

//     void showMenu() {
//         System.out.println("Help on:");
//         System.out.println("1. if");
//         System.out.println("2. switch");
//         System.out.println("3. for");
//         System.out.println("4. while");
//         System.out.println("5. do-while\n");
//         System.out.println("Choose one: (q to quit): ");
//     }

//     boolean isValid(char ch) {
//         if (ch < '1' | ch > '5' & ch != 'q') return false; 
//         else return true;
//     }

// }

// class HelpClassDemo {

//     public static void main(String[] args) throws java.io.IOException {

//         char choice, ignore;

//         Help hlpobj = new Help();

//         for (;;) {
//             do {
//                 hlpobj.showMenu();
//                 choice = (char) System.in.read();

//                 do {
//                     ignore = (char) System.in.read();
//                 } while (ignore != '\n');

//             } while (!hlpobj.isValid( choice ));

//             if (choice == 'q') {
//                 break;
//             }

//             System.out.println("\n");

//             hlpobj.helpOn(choice);
//         }
//     }
// }

package Exercicios;

import java.util.Scanner;

class Help {

    void helpOn(char what) {
        switch (what) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if (condition) statement;");
                System.out.println("else statement;\n");
                break;

            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch (expression) {");
                System.out.println("    case constant:");
                System.out.println("        statement sequence");
                System.out.println("        break;");
                System.out.println("    //...");
                System.out.println("}\n");
                break;

            case '3':
                System.out.println("The for:\n");
                System.out.println("for (init; condition; iteration)");
                System.out.println("    statement\n");
                break;

            case '4':
                System.out.println("The while:\n");
                System.out.println("while (condition) statement;\n");
                break;

            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println("    statement;");
                System.out.println("} while (condition);\n");
                break;
        }
        System.out.println();
    }

    public void showMenu() {
        System.out.println("Help on:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("3. for");
        System.out.println("4. while");
        System.out.println("5. do-while\n");
        System.out.println("Choose one: (q to quit): ");
    }

    boolean isValid(char ch) {
        if (ch < '1' || (ch > '5' && ch != 'q')) {
            return false;
        } else {
            return true;
        }
    }

}

class HelpClassDemo {

    public static void main(String[] args) {
        char choice;
        Scanner scanner = new Scanner(System.in);
        Help hlpobj = new Help();

        while (true) {
            hlpobj.showMenu();
            String input = scanner.nextLine();
            if (input.length() > 0) {
                choice = input.charAt(0);
            } else {
                continue;
            }

            if (!hlpobj.isValid(choice)) {
                break;
            }

            System.out.println("\n");

            hlpobj.helpOn(choice);
        }

        scanner.close();
    }
}
