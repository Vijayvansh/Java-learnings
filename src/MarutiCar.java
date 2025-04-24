public class MarutiCar extends CarforAbstraction{

    @Override
    void engine(){
        System.out.println("1.3L Petrol Engine");
    }

    @Override
    void drive(){
        System.out.println("You can Drive the car Now");
    }

    @Override
    void musicSystem(){
        System.out.println("You don't get Music System in the Maruti Car");
    }

    @Override
    void finalCar(){
        isFinalCarReady = true;
        System.out.println("You car is ready for delivery");
    }

    @Override
    void carPrice(){
        System.out.println("Car Price: $1000");
    }

    void range(){
        System.out.println("You will get Average Range: 15 KM/L");
    }

}
