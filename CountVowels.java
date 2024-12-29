package exercises;
import java.util.Scanner;
public class CountVowels {
    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') count++;
            else if (s.charAt(i) == 'e') count++;
            else if (s.charAt(i) == 'i') count++;
            else if (s.charAt(i) == 'o') count++;
            else if (s.charAt(i) == 'u') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Count of vowels in a string = " + countVowels(s));
    }
}
