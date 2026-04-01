import java.util.*;
public class vowel_count {
    public static int return_vowelscount(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if( str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word or a sentence");
        String str = sc.nextLine();
        System.out.println("Number of vowels = " +return_vowelscount(str));
        sc.close();
    }    
}
