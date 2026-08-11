import java.util.*;
public class Decode_str {
    public static String code_Decode(String str){
        Stack<Integer> int_S = new Stack<>();
        Stack<Character> str_S = new Stack<>();
        String temp, res="";
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                int count = 0;
                while(i<str.length() && Character.isDigit(str.charAt(i))){
                    count = count*10 + str.charAt(i) - '0';
                    i++;
                }
                int_S.push(count);
                i--;
            }
            else if(str.charAt(i) == '['){
                if(i>0 && Character.isDigit(str.charAt(i-1))){
                    str_S.push(str.charAt(i));
                }
                else{
                    str_S.push(str.charAt(i));
                    int_S.push(1);
                }
            }
            else if(str.charAt(i) == ']'){
                int count = 0;
                temp ="";
                if(!int_S.isEmpty()){
                    count = int_S.pop();
                    
                }

                while(!str_S.isEmpty() && str_S.peek() !='['){
                    temp = str_S.pop() + temp;
                    
                }
                if(!str_S.isEmpty() && str_S.peek() =='['){
                    str_S.pop();
                }

                for(int j=0; j<count; j++){
                    res += temp; 
                }

                for(int j=0; j<res.length(); j++){
                    str_S.push(res.charAt(j));
                }     
                
                res="";
            }
            else{
                str_S.push(str.charAt(i));
            }
        }

        while(!str_S.isEmpty()){
            res = str_S.pop() + res;
        }

        return res;
    }
    public static void main(String[] args) {
        String str = "3[b2[v]]";
        System.out.println(code_Decode(str));
    }    
}
