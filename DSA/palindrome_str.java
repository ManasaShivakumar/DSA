import java.util.Scanner;
public class palindrome_str {
    public static boolean ispalindrome(String str) {
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println(ispalindrome(str));
        sc.close();
    }    
}
