package Cap_1_4;

public class Help {
    public static void main(String[] args) throws java.io.IOException{

        char choice, ignore;
        do{

            System.out.println("Help on: ");
            System.out.println("1. if ");
            System.out.println("2. switch ");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while\n");
            System.out.println("Choose one: ");

            choice = (char) System.in.read(  );

            do{
                ignore = (char) System.in.read(  );
            } while(ignore != '\n');
        } while( choice < '1' | choice > '5');

            System.out.println("\n ");

        switch(choice){

            case '1' :
                System.out.println(" The if: \n");
                System.out.println(" if(condicion) statement;");
                System.out.println(" else statement; \n ");
            break;

            case '2':
                System.out.println(" The switch:\n ");
                System.out.println(" Switch(expression){");
                System.out.println("  case constant: ");
                System.out.println("    statement sequence");
                System.out.println("    break;");
                System.out.println("   //...");
                System.out.println(" } \n");
                break;

            case '3':
                System.out.println(" The for: \n");
                System.out.println(" for(init, condicion, iteration )");
                System.out.println(" statement \n");
            break;

            case '4':
                System.out.println(" The while: \n");
                System.out.println(" while(condicion) statement;\n");
            break;
            
            case '5':
                System.out.println(" The do-while: \n");
                System.out.println(" do { ");
                System.out.println("    statement; ");
                System.out.println(" }  while (condicion);\n ");
            break; 
        }       
                
        
        
    }
}
