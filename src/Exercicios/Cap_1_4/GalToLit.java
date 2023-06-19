package Cap_1_4;
// coverte galões em litros
public class GalToLit {
    public static void main(String[] args) throws Exception {
        double gallons, liters;
        int counter;

        counter = 0; // inicio contador
        gallons = 1; // inicio galões
        for(gallons = 1; gallons <= 50; gallons++){

            liters = gallons * 3.7854; // converte para litros

            System.out.println(gallons + " gallons is "+ liters +" liters.");
            counter++;
            if(counter == 10){
                System.out.println();
                counter = 0;
            }
        }
    }
}