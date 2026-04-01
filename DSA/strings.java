public class strings {
    public static void print_string(String Name){
        for(int i=0; i<Name.length(); i++){
            System.out.print(Name.charAt(i)+" ");
        }
    }
    public static String print_substring(String str, int si, int ei) {
        String substr = "";
        for(int i =si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");
        // System.out.println(str);
        // System.out.println(str2);
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
    //     String firstName = "Manasa";
    //     String lastName ="B S";
    //     String fullname = firstName +" "+lastName;
    //     print_string(fullname);
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");
        // if(s1.equals(s2)) {
        //     System.out.println("Equal");
        // }
        // else {
        //     System.out.println("not equal");
        // }
        // if(s1.equals(s3)) {
        //     System.out.println("Equal");
        // }
        // else {
        //     System.out.println("not equal");
        // }
        // String str = "HelloManasa";
        // System.out.println(str.substring(0,5));
        StringBuilder sb = new StringBuilder(" ");
        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);        
    }    
}
