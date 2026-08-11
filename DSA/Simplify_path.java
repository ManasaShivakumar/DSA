import java.util.Stack;
public class Simplify_path {
    public static String simplifyPath(String str, String res){
        Stack<String> s = new Stack<>();
        res +="/";
        for(int i=0; i<str.length(); i++){
            String dir = "";
            while(i < str.length() && str.charAt(i) == '/'){
                i++;
            }
            while(i< str.length() && str.charAt(i) != '/'){
                dir += str.charAt(i);
                i++;
            }
            if(dir.equals("..") == true){
                if(!s.empty()){
                    s.pop();
                }
            }
            else if(dir.equals(".") == true){
                continue;
            }
            else if(dir.length() != 0){
                s.push(dir);
            }

        }
        Stack<String> s2 = new Stack<>();
        while(!s.isEmpty()){
            s2.push(s.pop());
        }
        while(!s2.empty()){
            if(s2.size() != 1){
                res += (s2.pop() + "/");
            }
            else{
                res += s2.pop();
            }            
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "/home/manasa/dsa/";
        System.out.println(simplifyPath(str, ""));
    }    
}
