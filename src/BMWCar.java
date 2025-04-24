public class BMWCar extends CarforAbstraction{

    @Override
    void engine(){
        System.out.println("Twin-Turbo V8 Engine with 555 HP");
    }

    @Override
    void drive(){
        System.out.println("You can Drive the car Now");
    }

    @Override
    void musicSystem(){
        System.out.println("You JBL Legend Music System in the BMW Car");
    }

    @Override
    void finalCar(){
        isFinalCarReady = true;
        System.out.println("You car is ready for delivery");
    }

    @Override
    void carPrice(){
        int carPrice = 500;
        System.out.println("Car Price: $" + carPrice);
    }

    void topSpeed(){
        System.out.println("This is a Sports Car with Top Speed of 220 MPH");
    }

}
