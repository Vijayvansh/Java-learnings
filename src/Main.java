public class Main {
    public static void main(String[] args) {

        ArrayListExample arrayListExample = new ArrayListExample();

        arrayListExample.addElementsToArrayList();
        arrayListExample.sortArrayList();
        System.out.print("New ArrayList: " + arrayListExample.list);


    }

}





/*
    public static void main(String[] args) {

        // Polymorphism = "POLY" -> "MANY"
        //                "MORPH" -> "SHAPE"
        //                Objects can identify as other object.
        //                Objects can be treated as object of common superclass.

        Bicycle bicycle = new Bicycle();
        Bike bike  = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {bicycle, bike, boat};

        for (Vehicle vehicle: vehicles){
            vehicle.go();
        }

    }

 */
/*
    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementing classes MUST define.
        //             Supports multiple Inheritance like behaviour.

        FishforInterface fish = new FishforInterface();
        Rabbit rabbit = new Rabbit();
        Hunter hunter = new Hunter();

        hunter.hunt();
    }

 */
/*
    public static void main(String[] args) {

        // abstract =  used to define abstract class and methods.
        //             Abstraction is the process of hiding implementation details
        //             and showing only the essential features.
        //             Abstract class can't be instantiated directly.
        //             Can contain 'abstract' method (which must be implemented)
        //             Can contain 'concrete' method (which are inherited)

        MarutiCar vitara = new MarutiCar();
        TeslaCar cyberTruck = new TeslaCar();
        BMWCar m5 = new BMWCar();

        cyberTruck.musicSystem();
        vitara.musicSystem();
        m5.musicSystem();

    }

 */
/*
    public static void main(String[] args) {

        // toString = Method inherited from the object class.
        //            Used to return a String representation of an object.
        //            By default, it returns a hash code as a unique identifier.
        //            It can be overridden to provide meaningful information or details.

        CarFortoString carFortoString1 = new CarFortoString("Ford", "Mustang", "Yellow", 2025);
        CarFortoString carFortoString2 = new CarFortoString("BMW", "7-Series", "White", 2025);

        System.out.println(carFortoString1);
        System.out.println(carFortoString2);

    }

 */
/*
    public static void main(String[] args) {

        // Overriding = When a subclass provides its own implementation
        //              of a method that is already defined.
        //              Allow for code reusability and give specific implementations.

        Dog dog = new Dog("Dog");
        Cow cow = new Cow("Cow");
        Fish fish = new Fish("Fish");

        dog.move();
        cow.move();
        fish.move();

    }

 */
/*
    public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructor and method overriding
        //         Calls to the parent constructor to initialize the attributes.

        StudentForInheritence[] students = {new StudentForInheritence("Vijay Vansh Saini", 19, 8),
                new StudentForInheritence("Plkit", 20, 8.5),
                new StudentForInheritence("Khushal", 21, 0),
                new StudentForInheritence("Keshav", 24, 8.5)};

        Teacher[] teachers = {new Teacher("Teacher1", 26, "OOPS"),
                new Teacher("Teacher2", 29, "OS"),
                new Teacher("Teacher3", 42, "DBMS"),
                new Teacher("Teacher4", 37, "DSA"),};

        for (StudentForInheritence student: students){
            student.displayInformation();
            System.out.println("Grade: " + student.grades);
            System.out.println();
        }

        for (Teacher teacher: teachers){
            teacher.displayInformation();
            System.out.println("Subject: " + teacher.subject);
            System.out.println();
        }

    }

 */
/*
    public static void main(String[] args) {

        // Inheritance = One class inherit the attributes and methods
        //               from another class.
        //               Child <- Parent <- GrandParent

        StudentForInheritence[] students = {new StudentForInheritence("Vijay Vansh Saini", 19, 8),
                                            new StudentForInheritence("Plkit", 20, 8.5),
                                            new StudentForInheritence("Khushal", 21, 0),
                                            new StudentForInheritence("Keshav", 24, 8.5)};

        Teacher[] teachers = {new Teacher("Teacher1", 26, "OOPS"),
                              new Teacher("Teacher2", 29, "OS"),
                              new Teacher("Teacher3", 42, "DBMS"),
                              new Teacher("Teacher4", 37, "DSA"),};

        for (StudentForInheritence student: students){
            student.displayInformation();
            System.out.println("Grade: " + student.grades);
            System.out.println();
        }

        for (Teacher teacher: teachers){
            teacher.displayInformation();
            System.out.println("Subject: " + teacher.subject);
            System.out.println();
        }
    }

 */
/*
    public static void main(String[] args) {
        Friend friend1 = new Friend("Pulkit", "Kuposhan", "Nothing");
        friend1.friendDetails();

        Friend friend2 = new Friend("Pulkit", "Kuposhan", "Nothing");
        friend1.friendDetails();
    }
 */
/*  For Friend class -------------------------------------------------
    public static void main(String[] args) {

        // static = Makes a variable or Method belong to the class
        //          rather than any specific object of class
        //          commonly use for utility method or shared resources
        //          [recommended Access by className. Name]


//        Friend[] friends = {new Friend("Pulkit", "Kuposhan", ""),
//                            new Friend("Khushal", "Mastklandar", "Kya Rkkhe"),
//                            new Friend("Jatin", "Sukhi Haddi", "thikthak"),
//                            new Friend("Keshav", "Coder", "Khatarnak Log")};

        Friend friend1 = new Friend("Pulkit", "Kuposhan", "");

        friend1.friendDetails();

        Friend friend2 = new Friend("Khushal", "Mastklandar", "Kya Rkkhe");
        friend1.friendDetails();

    }  */
/*  public static void main(String[] args) {

        // Array of Object =


        Car[] cars = {new Car("Thar", "Black"),
                      new Car("Mustang", "Red"),                  //   Anonymous Objects
                      new Car("Charger", "Yellow"),
                      new Car("Corvette", "Blue")
                     };

        for (Car car: cars){
            car.color = "white";
        }

        for (Car car: cars){
            car.drive();
        }
    }  */
/*  For Student class ----------------------------------------------------------

    public static void main(String[] args) {

        // Constructor = A special method to initialize object
        //               You can pass argument to a constructor
        //               and setup initial values

        Student student1 = new Student("Vijay", 18, 8.0, true);
        Student student2 = new Student("Pulkit", 20, 8.5, true);
        Student student3 = new Student("Khushal", 21, 0.0, true);
        Student student4 = new Student("Keshav", 24, 8.0, true);
        Student student5 = new Student("Dhruv", 20, 8.0, true);

        System.out.printf("Student1 Details:\nName: %s\nAge: %d\nCGPA: %.1f\nisEnrolled: %b\n", student1.name, student1.age, student1.cgpa, student1.isEnrolled);
        student1.isStudying();

        System.out.printf("\nStudent2 Details:\nName: %s\nAge: %d\nCGPA: %.1f\nisEnrolled: %b\n", student2.name, student2.age, student2.cgpa, student2.isEnrolled);
        student2.isStudying();

        System.out.printf("\nStudent3 Details:\nName: %s\nAge: %d\nCGPA: %.1f\nisEnrolled: %b\n", student3.name, student3.age, student3.cgpa, student3.isEnrolled);
        student3.isStudying();

        System.out.printf("\nStudent4 Details:\nName: %s\nAge: %d\nCGPA: %.1f\nisEnrolled: %b\n", student4.name, student4.age, student4.cgpa, student4.isEnrolled);
        student4.isStudying();

    }

 */
/*  For Car class ----------------------------------------------------------

    public static void main(String[] args) {

        // Object =  An entity that hold data (attributes)
        //           can perform some actions (Methods)
        //           It is a reference data type.

        Car mustang = new Car();
        Car thar = new Car();

        System.out.println(thar.model);
        System.out.println(thar.brand);
        System.out.println(thar.color);
        System.out.println("$" + thar.price);
        System.out.println("\nBreaks: " + thar.isBreaking);
        thar.carStart();
        System.out.println("\nBreaks: " + thar.isBreaking);
        thar.carStop();
        System.out.println("\nBreaks: " + thar.isBreaking);

        System.out.println();

        System.out.println(mustang.model);
        System.out.println(mustang.brand);
        System.out.println(mustang.color);
        System.out.println("$" + mustang.price);
        System.out.println("\nBreaks: " + mustang.isBreaking);
        thar.carStart();
        System.out.println("\nBreaks: " + mustang.isBreaking);
        thar.carStop();
        System.out.println("\nBreaks: " + mustang.isBreaking);

    }

     */