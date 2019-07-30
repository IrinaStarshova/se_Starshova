package sef.module9.sample;

import java.util.Arrays;

public class ComparableSample {

	/* Creates objects using the Car class which implements the Comparable
     * interface.
     * Compares and sorts the objects by mileage.
     */
   public void example() {
       
       //Creating the objects that implements the Comparable interface
       Car car1 = new Car("Toyota", 2006, 5000);
       Car car2 = new Car("BMW", 2007, 5000);
       Car car3 = new Car("Chrysler", 2007, 4000);
       
       //Comparing the objects by calling the compareTo method on one of them
       //passing another object as argument.
       System.out.println("Car 1 equals Car 2: " + car1.compareTo(car2));
       System.out.println("Car 1 equals Car 3: " + car1.compareTo(car3));
       System.out.println("Car 2 equals Car 3: " + car2.compareTo(car3));
       System.out.println();
       
       //To sort them we create an array which is passed to the Arrays.sort()
       //method.
       Car[] carArray = new Car[] {car1, car2, car3};
       Arrays.sort(carArray);
       
       //Print out the sorted array
       for (Car car : carArray)
           System.out.println(car.toString());
   }
   
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       new ComparableSample().example();
   }


}
