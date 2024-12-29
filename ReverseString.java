package exercises;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("The reversed string is: ");
        StringBuilder reversed = new StringBuilder(s);
        reversed.reverse();
        System.out.print(reversed);
    }
}
