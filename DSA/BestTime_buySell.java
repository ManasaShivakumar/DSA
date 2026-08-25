public class BestTime_buySell {
    public static int buy_sell(int[] prices){
        int buy = prices[0];
        int max_profit = 0;
        for(int i=1; i<prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            else if((prices[i]-buy) > max_profit){
                max_profit = prices[i]-buy;
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("max profit = "+buy_sell(prices));
    }    
}
