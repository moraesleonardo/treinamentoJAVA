//import java.util.Arrays;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        //String [] parts = {"tires", "keys"};

        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[]{
                new Car("Nissan", 5000, 2020, "red", new String[] {"tires","keys"}),
                new Car("Dodge", 8500, 2019, "blue", new String[] {"tires","keys"}),
                new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires","filter"}),
                new Car("Honda", 7000, 2019, "orange", new String[] { "tires", "filter" }),
                new Car("Mercedez", 12000, 2015, "jet black", new String[] { "tires", "filter", "transmission"}),
        };

        //Car nissan = new Car("Nissan", 5000, 2020, "red", parts);
        //Car dodge = new Car("Dodge", 11000, 2019, "blue", parts);
        //Car nissan2 = new Car(nissan);

        //nissan2.setColor("yellow"); 
        //nissan2.setParts(new String[] {"tires", "filter"});
        
        //System.out.println(Arrays.toString(nissan2.getParts()));
        

        Dealership dealership = new Dealership(cars);
        System.out.println(dealership);

        System.out.println("\n *** JAVA DEALERSHIP!! *** \n");
        System.out.println("Welcome! Enter the type of car you are looking for: ");
        //pick up make
        String make = scan.nextLine();
        System.out.println("Enter your budget: ");
        int budget = scan.nextInt();

        int index = dealership.search(make, budget);

        switch(index){
            case 404: System.out.println("Feel free to browse through our collection of cars.\n");
            System.out.println(dealership);
            break;

            default: scan.nextLine();
            String decision = scan.nextLine();
            if(decision.equalsIgnoreCase("yes")){
                dealership.sell(index);
            }
        }
        
        //for (int i = 0; i < cars.length; i++) {
        //    dealership.setCar(cars[i],i);
        //}
        //dealership.sell(2);

        //System.out.println(dealership.search("Dodge", 10000));

        //Car newCar = dealership.getCar(0);
        //newCar.setColor("blue");
        //System.out.println(newCar);
        //System.out.println(dealership.getCar(0));

        //dealership.setCar(cars[0], 0);
        //dealership.setCar(cars[1], 1);
        //dealership.setCar(cars[2], 2);

        //System.out.println(nissan);
        //System.out.println(dodge);
        //System.out.println(nissan2);

        //System.out.println(nissan2.getColor);


        //nissan.setColor("Jet Black");
        //dodge.setColor("Jet Black");

        //nissan.setPrice(nissan.getPrice() / 2);
        //dodge.setPrice(dodge.getPrice() / 2);

        //System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        //System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
        //System.out.println("This " + nissan2.getMake() + " is worth $" + nissan2.getPrice() + ". It was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + ".\n");

        //System.out.println(Arrays.toString(nissan.parts));
        
        //nissan.drive();
        //dodge.drive();
        //nissan2.drive();
    scan.close();
    }
}
