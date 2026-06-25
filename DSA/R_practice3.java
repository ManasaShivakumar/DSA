public class R_practice3 {
    public static int lengthofString(String str){               
        if(str.length()==0){            
            return 0;
        }
        return lengthofString(str.substring(1)) + 1;                
    }
    public static void main(String[] args) {
        System.out.print(lengthofString("manasa"));
    }    
}
