import java.util.Stack;
public class Valid_parentheses {
    public static boolean isValidParentheses(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            if(curr == '(' || curr == '[' || curr =='{' ){
                s.push(curr);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && curr == ')') || (s.peek()=='[' && curr == ']') || (s.peek()=='{' && curr == '}')){
                    s.pop();
                } 
                else{
                    return false;
                }               
            }            
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;      
    }
    public static void main(String[] args) {
        String str = "[]{";
        System.out.println(isValidParentheses(str));
    }    
}
