public class Student {

    String name;
    int age;
    double cgpa;
    boolean isEnrolled;

    Student(String name, int age, double cgpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.isEnrolled = isEnrolled;
    }

    void isStudying() {
        System.out.println(this.name + " is studying. !-VERY GOOD-!");
        System.out.println(Math.exp(age));
        System.out.println(Math.exp(age));
    }


}
