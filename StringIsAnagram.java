package exercises;
import java.util.Scanner;
import java.util.Arrays;
public class StringIsAnagram {
    public static boolean isAnagram(String a, String b) {
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        if(arrA.length != arrB.length) return false;
        else {
            for (int i = 0; i < arrA.length; i++) {
                if(arrA[i] != arrB[i]) return false;
            }
            return true;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = sc.nextLine();
        System.out.println("Enter a string: ");
        String b = sc.nextLine();
        if(isAnagram(a, b)) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}
