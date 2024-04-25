//Write a program in java that finds second largest number in an array.
public class SecondLargest {
    public static void main (String[]args) {
        int[]array = {10,23,14,6,8,19};
        int secondLargest = findSecondLargest(array);
        System.out.println("The second largest number is: "+ secondLargest);
    }
    public static int findSecondLargest(int[]array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i:array) {
            if (i>max) {
                secondMax = max;
                max = i;
            }else if (i>secondMax && i!=max) {
                secondMax = i;
            }
        }
        return secondMax;
    }
}
