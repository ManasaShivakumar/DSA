public class Max_balancedStr_part {
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int r=0, l=0;
        int ans = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'L'){
                l++;
            }
            if(str.charAt(i) == 'R'){
                r++;
            }
            if(l == r){
                ans++;
            }
        }

        System.out.println("max no of balanced partitions = "+ans);
    }
    
} 
