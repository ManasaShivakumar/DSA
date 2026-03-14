public class largest {
    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<num.length; i++) {
            if ( largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("Smallest number = " +smallest);
        return largest;
        
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 6, 3, 5};
        System.out.println("Largest number = "+ getLargest(num));
        
    }
    
}
