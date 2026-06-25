public class R_duplicte {
    public static String removeDuplicates(int i, String str, StringBuilder newStr, boolean map[]){        
        if(i==str.length()){            
            return newStr.toString();
        }
        if(map[str.charAt(i)-'a']){
            return removeDuplicates(i+1, str, newStr, map);
        }
        else{
            map[str.charAt(i)-'a'] = true;
            return removeDuplicates(i+1, str, newStr.append(str.charAt(i)), map);
        }     
    }
    public static void main(String[] args) {
        String str = "appnnacollege";   
        System.out.println(removeDuplicates(0, str, new StringBuilder(""), new boolean[26]));        
    }
}

