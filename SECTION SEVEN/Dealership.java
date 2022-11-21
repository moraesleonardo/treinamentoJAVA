//import java.util.Arrays;
//import java.util.Scanner;

public class Dealership {
   
        private Car[] cars;

        public Dealership(Car[] cars){
            this.cars = new Car[cars.length];
            for(int i=0; i < cars.length; i++){
                this.cars[i] = new Car(cars[i]);
            }
            //System.out.println(Arrays.toString(this.cars));
        }

        public void setCar(Car car, int index) {
            this.cars[index] = new Car(car);
        }
   
        public Car getCar(int index){
            return new Car(this.cars[index]);
        }

        public void sell(int index){
            this.cars[index].drive();
            this.cars[index] = null;
        }

        //@param make 
        //@param budget
        //@return

        public int search(String make, int budget){
            for (int i = 0; i < this.cars.length; i++){
                if (this.cars[i] == null){
                    continue;
                }
                else if (this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget){
                    System.out.println("\nWe found a car in spot " + i + "\n\n" + cars[i].toString());
                    System.out.println("If you are interested, type 'yes': ");
                    return i;
                   } 
            }
            System.out.println("\nYour search didn't match any results.\n");
            return 404;
        }
        public String toString() {
            String temp = "";
            for(int i=0; i < this.cars.length; i++){
                temp += "Parking Spot: " + i + "\n";
                if (this.cars[i] == null){
                    temp += "Empty\n";
                } else {
                    temp += this.cars[i].toString() + "\n";
                }
                

            }
            return temp;
        }
       
}
