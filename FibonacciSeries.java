package exercises;

import java.util.Scanner;

public class FibonacciSeries {
    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibonacciSeries fib = new FibonacciSeries();
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        // 1 1 2 3 5 8 13
        System.out.print("The fibonacci series is : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fib.fibonacci(i)+ " ");
        }
    }
}
