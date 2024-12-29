package exercises;

import java.util.Scanner;

public class NumberPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int realnum = num;
        int reversed = 0;
        while(num != 0) {
            int s = num % 10;
            reversed = reversed * 10 + s;
            num /= 10;
        }
        if(reversed == realnum) {
            System.out.println("Number is a palindrome.");
        }
        else {
            System.out.println("Number is not a palindrome.");
        }
    }
}
