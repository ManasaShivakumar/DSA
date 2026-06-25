public class R_practice2 {
    public static void numbertoString(int n){
        if(n==0){
            return;
        }
        String str[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int ld = n%10;
        numbertoString(n/10);
        System.out.print(str[ld]+" ");
    }
    public static void main(String[] args) {
        numbertoString(2004);
    }  
}
