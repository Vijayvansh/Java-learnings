public class CarFortoString {

    String brand;
    String model;
    String color;
    int year;

    CarFortoString(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString(){
        return "I derive " + this.year + " " + this.color + " " + this.brand + " " + this.model;
    }

}
