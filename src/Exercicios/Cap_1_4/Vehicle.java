package Cap_1_4;
// classe geral
public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;


    void range (){
        System.out.println("Range is " + fuelcap * mpg);// método calcular o consumo de combustivel
    }

    double fuelneed (int miles) { // método calcular consumo de combustivel por determinada numero de milhas
        return (double) miles / mpg;

    }
}

// classe para criar o objeto
class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle spotscar = new Vehicle();

        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        spotscar.passengers = 2;
        spotscar.fuelcap = 14;
        spotscar.mpg = 12;

        gallons = minivan.fuelneed(dist);

        System.out.println("Minivan can carry " + minivan.passengers + ". ");
        minivan.range();
        System.out.println( " To go " + dist + " miles Minivan need " + gallons + " gallons of fuel" );

        gallons = spotscar.fuelneed(dist);

        System.out.println("Sportscar can carry " + spotscar.passengers + ". ");
        spotscar.range();
        System.out.println( " To go " + dist + " miles Spotscar need " + gallons + " gallons of fuel" );

        


    }
}

