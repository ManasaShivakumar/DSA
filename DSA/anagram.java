import java.util.*;
public class anagram {
    public static void print_Anagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2  = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char S1[] = str1.toCharArray();
            char S2[] = str2.toCharArray();
            Arrays.sort(S1);
            Arrays.sort(S2);
            boolean results = Arrays.equals(S1, S2);
            if(results) {
                System.out.println(str1 + " and "+str2+" are anagrams of each other.");
            }
            else {
                System.out.println(str1+" and "+str2+" are not anagrams of each other");
            }
        }
        else {
            System.out.println(str1+" and "+ str2 + " are not anagrams");
        }
    }
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";
        print_Anagram(str1, str2);
    }    
}
