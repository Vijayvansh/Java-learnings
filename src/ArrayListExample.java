import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    ArrayList<Integer> list = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    void addElementsToArrayList(){
        int n;
        System.out.print("How much Element you want to add into ArrayList: ");
        n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++){
            list.add(input.nextInt());
        }
    }

    void addElementAtArrayListIndex() {

        System.out.print("Which index at You want to add element in ArrayList: ");
        int index = input.nextInt();
        System.out.print("What element you want to add in Arraylist at index " + index + ": ");
        int element = input.nextInt();

        list.add(index, element);
    }

    void setElementAtArrayListIndex() {

        System.out.print("Which index at You want to set or change the element in ArrayList: ");
        int index = input.nextInt();
        System.out.print("From which element you want to replace with the element of ArrayList index " + index + ": ");
        int element = input.nextInt();

        list.set(index, element);
    }

    void removeElementAtArrayListIndex() {

        System.out.print("Which index from You want to remove the element in ArrayList: ");
        int index = input.nextInt();

        list.remove(index);
    }

    void sortArrayList() {
        list.sort(Integer::compareTo);
    }

}
