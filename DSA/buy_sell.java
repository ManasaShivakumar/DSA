public class buy_sell {
    public static void stocks(int price[]) {
        int BP = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<price.length; i++) {            
            if (BP < price[i]) {
                int profit = price[i]-BP;   
                max = Math.max(max, profit);          
            }
            else {
                BP = price[i];
            }            
        }
        System.out.println("Maximum profit = "+max);
    }
    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        stocks(price);
    }    
}
