//Develop a method named reverseString that takes a string and returns a new string
// which is the reverse of the input
public class ReverseString {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse(). toString();
    }
    public static void main(String[]args) {
        String oldString = "The land is green";
        String reversedString = reverseString(oldString);
        System.out.println(reversedString);



    }

}
