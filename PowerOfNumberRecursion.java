package exercises;
import java.util.Scanner;
public class PowerOfNumberRecursion {
    public static int powerOfNumber(int n, int s) {
       if(s == 0) return 1;
       else return n * powerOfNumber(n, s - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter power of number: ");
        int s = sc.nextInt();

        System.out.println(n + "^" + s + " is equal to " + powerOfNumber(n, s));
    }
}
