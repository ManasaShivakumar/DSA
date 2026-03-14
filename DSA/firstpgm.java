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
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static int sum(int a, int b, int c) {
    //     return a+b+c;
    // }
    // public static float sum(float a, float b) {
    //     return a+b;
    // }
    // public static void main(String[] args) {
    //     System.out.println((sum(4,6)));
    //     System.out.println((sum(4,5,9)));
    //     System.out.println((sum(2.8f,2.96f)));
        
    // }
    // public static void passingBY(int marks[], int num) {
    //     num = 10;
    //     for(int i= 0; i<marks.length; i++) {
    //         marks[i] = marks[i]+1;
    //     }
    //     System.out.println(num);
    // }
    //Linear search
    // public static int findnum(int numbers[]) {
    //     for(int i=0; i<numbers.length; i++) {
    //         if(numbers[i] == 10) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    //Binary search
    public static int findBS(int numbers[], int key) {
        int start = 0, end = numbers.length-1;
        while(start <= end) {
            int mid = (start +end)/2;
            if(numbers[mid]==key) {
                return mid;
            }
            else if(numbers[mid] > key) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        // int marks[] = new int[100];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your marks :");
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println(marks[0]+"\n"+marks[1]+"\n"+marks[2]);
        // int num = 5;
        // int marks[] = {97, 84, 48};
        // passingBY(marks, num);
        // System.out.println(num);
        // for(int i=0; i<marks.length; i++) {
        //     System.out.println(marks[i]);
        // }
        int numbers[] = {4, 5, 6, 7, 8, 10, 12};
        int key = 10;
        int index = findBS(numbers, key);
        if (index == -1) {
            System.out.println("NOT found");
        }
        else {
            System.out.println("number is at index : "+index);
        }
    }
}