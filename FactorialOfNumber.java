package exercises;
import java.util.Scanner;
public class FactorialOfNumber {
    public static int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int answer = factorial(n);
        System.out.println("The factorial of a number = " + answer);
    }
}
