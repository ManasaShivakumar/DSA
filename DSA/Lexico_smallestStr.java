import java.util.Arrays;

public class Lexico_smallestStr {
    public static void lexo_smallString(int n, int k){
        char arr[] = new char[n];
        Arrays.fill(arr, 'a');
        for(int i=n-1; i>=0; i--){
            k -= i;
            if(k > 0){
                if(k>= 26){
                    arr[i] = 'z';
                    k -= 26;
                }
                else{
                    arr[i] = (char)(k +'a'-1);
                    k -= arr[i]-'a'+1;
                }
            }
            else {
                break;
            }
            
            k += i;
        }
        System.out.println(new String(arr));
    }
    public static void main(String[] args){
        lexo_smallString(5, 42);
    }    
}
