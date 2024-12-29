package exercises;
import java.util.Scanner;
public class IsSubstring {
    public static boolean isSubstring(String a, String b) {
        boolean contain = a.contains(b) || b.contains(a);
        return contain;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = sc.nextLine();
        System.out.println("Enter b string: ");
        String b = sc.nextLine();
        if(isSubstring(a, b)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}
