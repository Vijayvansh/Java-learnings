import java.util.Scanner;

public class ArraySwap {

    int n;
    int[] arr = new int[n];

    Scanner input = new Scanner(System.in);

    void arrayDeclaration(int n) {
        this.n = n;
    }

    void insertElement(int n){
        System.out.print("Insert Values in Array: ");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
    }

}
