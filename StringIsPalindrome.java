package exercises;
import java.util.Scanner;
public class StringIsPalindrome {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(isPalindrome(s)){
            System.out.println( s + " is palindrome");
        }
        else {
            System.out.println( s + " is not palindrome");
        }
    }
}
