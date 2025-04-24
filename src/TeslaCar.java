public class TeslaCar extends CarforAbstraction{

    @Override
    void engine(){
        System.out.println("200HP Electric Motor");
    }

    @Override
    void drive(){
        System.out.println("You can Drive the car Now");
    }

    @Override
    void musicSystem(){
        System.out.println("You get Sony XAV-AX5500 Music System in the Tesla Car");
    }

    @Override
    void finalCar(){
        isFinalCarReady = true;
        System.out.println("You car is ready for delivery");
    }

    @Override
    void carPrice(){
        int carPrice = 3000;
        System.out.println("Car Price: $" + carPrice);
    }

    void autoDrive(){
        System.out.println("This car have Driver less Mode");
    }
}
