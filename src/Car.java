public class Car {

   /* String model = "Mustang";
    String brand = "Ford";
    String color = "White";
    double price = 50000;

    boolean isRunning = false;
    boolean isBreaking =  true;

    void carStart(){
        isBreaking = false;
        System.out.print("Engine Starts!");
        isRunning = true;
    }

    void carStop(){
        isRunning = false;
        System.out.print("Car Stop!");
        isBreaking = true;
    } */

    String model;
    String color;

    Car(String model, String color){
        this.color = color;
        this.model = model;
    }

    void drive(){
        System.out.println("You drive " + color + " " + model);
    }

}
