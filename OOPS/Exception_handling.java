public class Exception_handling {
    public static void fun(int age) throws Exception  {
        if(age < 18){
            throw new Exception("Error");
        }        
    }
    public static void main(String[] args) {
        // try {
        //     //int x= 10/0;
        //     int arr[] = {1,2,3};
        //     System.out.println(arr[5]);

        // }         
        // catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }   
        // catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // finally {
        //     System.out.println("completed");
        // }
        // System.out.println("good");
        // int age = 8;
        // if(age < 18) {
        //     throw new ArithmeticException("Not Eligible");
        // }
        
        try {
            fun(21);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }    
}
