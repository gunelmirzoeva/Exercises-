package exercises;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    public static boolean BinarySearch(int arr[], int search) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == search) {
                return true;
            }
            else if(arr[mid] < search) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the element to be searched");
        int search = sc.nextInt();
        if(BinarySearch(arr, search)) {
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }
}
