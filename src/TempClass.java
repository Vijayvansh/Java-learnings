public class TempClass {

    public static void main(String[] args) {
        int[] anArray = {12, 13, 14, 15, 16, 17, 18, 19};
        int[] swepedArray = new int[anArray.length];

        int firstElement, secondElement, temp;

        for (int i = 0; i < anArray.length - 1; i = i+2){

            firstElement  = anArray[i];
            secondElement = anArray[i+1];
            temp = firstElement;
            firstElement = secondElement;
            secondElement = temp;

            swepedArray[i] = firstElement;
            swepedArray[i+1] = secondElement;
        }

        for (int swipedArrayElement : swepedArray) {
            System.out.print(swipedArrayElement + ", ");
        }

    }
}
