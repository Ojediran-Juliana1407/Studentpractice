// Write a method named printArray that takes an array of integers as a parameter
//and prints each element in the array
public class ArrayPrinting {
    public static void main (String[]args) {
        int [] myArray = {2,3,4,5,6};
        printArray(myArray);
    }
    public static void printArray(int[]array) {
        for (int i =0; i< array.length;i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}
