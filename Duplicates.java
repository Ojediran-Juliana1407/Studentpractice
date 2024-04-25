// Write a java program to remove duplicates from an array of integers
// you should return the unique numbers in their original order
import java.util.LinkedHashSet;
import java.util.Set;


public class Duplicates {

    public static int [] removeDuplicates(int[]array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i:array) {
            set.add(i);
        }
        int []uniqueArray = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            uniqueArray[i++] =num;
        }
        return uniqueArray;
    }
    public static void main(String[]args) {
        int[]array = {1,1,2,2,3,4,4,5,6,6};
        int[]uniqueArray = removeDuplicates(array);
        for(int i: uniqueArray) {
            System.out.print(i+ " ");
        }
    }
}
