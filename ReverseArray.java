package exercises;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt(), k = 0;
        int[] arr = new int[n];
        int[] reversedArr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            reversedArr[k++] = arr[i];
        }
        //print reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }
}
