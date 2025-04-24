public class FishforInterface implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("Fish is swimming away from Sharks");
    }

    @Override
    public void hunt(){
        System.out.println("Fish is Hunting small Fishes");
    }
}
