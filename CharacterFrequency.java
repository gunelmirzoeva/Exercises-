package exercises;
import java.util.Scanner;
public class CharacterFrequency {
    public static int[] countOfCharacters(String str) {
        char[] chars = str.toCharArray();
        int[] freq = new int[128];
        for(char c : chars) {
            freq[c]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = countOfCharacters(str);
        for(int i=0; i<freq.length; i++) {
            if(freq[i] > 0) {
                System.out.println((char)i +" - "+freq[i]);
            }
        }

    }
}
