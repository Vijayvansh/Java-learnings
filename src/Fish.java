public class Fish extends Animal {

    Fish(String animalName){
        super(animalName);
    }

    @Override
    void move(){
        System.out.println("Fish is swimming");
    }

}
