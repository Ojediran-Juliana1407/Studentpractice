//Write a method named add that takes two integers as parameter and returns their sum.
public class Sum {
    public static int add (int num1,int num2) {
        return num1 + num2;
    }
    public static void main(String[]args) {
        int result = add(15,6);
        System.out.println("The sum of both numbers is: "+ result);
    }
}
