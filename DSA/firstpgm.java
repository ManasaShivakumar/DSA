// public class firstpgm {
//     public static void main(String args[]){
    //     System.out.println("hello world");
    //     System.out.println("****");
    //     System.out.println("***");
    //     System.out.println("**");
    //     System.out.println("*");
    // byte b=8;
    // System.out.println(b);
    // short s=240;
    // char ch='*';
    // boolean a=true;
    // int number=34;
    // float price=100.5f;
    // System.out.println(price);
    // double g=15.0345;
    // char a ='a';
    // char b = 'b';
    // System.out.println((int)b);
    // System.out.println((int)a);
    // System.out.println(b-a);
    // short a =5;
    // byte b =25;
    // char c = 'c';
    // byte bt = (byte) (a+b+c);
    // System.out.println(bt);
    // int a =10;
    // float b=20.51f;
    // long c=14;
    // double d =45;
    // double ans = a+b+c+d;
    // System.out.println(ans);
    // byte b=5;
    // b=(byte)(b*2);
    // System.out.println(b);
    // int a = 10;
    // int b = a++;
    // int c = ++a;
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
    // int larger = (5<3) ? 5 : 3 ;
    // System.out.println(larger);
    // String type = (5%2 == 0) ? "even" : "odd" ;
    // System.out.println(type);
    // int counter = 0;
    // while (counter <= 10) {
    //     System.out.println("Hello World");
    //     counter ++;
    // }
    // for (int i=1; i<=5; i++) {
    //     if (i==3) {
    //         break;
    //     }
    //     System.out.println(i);
    // }
    // System.out.println("I am out of the loop");
//     printHW(); //function call
//     printHW();
//     printHW();

//     }
//     public static void printHW() {
//         System.out.println("Hello World");
//         return;
//     }
// }

// import java.util.*;
public class firstpgm {
    // public static int calcsum(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enetr 2 numbers : ");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     System.out.println(calcsum(a,b));
    //     sc.close();
    // }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println((sum(4,6)));
        System.out.println((sum(4,5,9)));
        System.out.println((sum(2.8f,2.96f)));
        
    }
}