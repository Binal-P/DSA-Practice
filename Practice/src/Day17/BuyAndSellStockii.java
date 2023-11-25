package Day16;

public class BuyAndSellStockii {
    //You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
    //
    //On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
    //
    //Find and return the maximum profit you can achieve.
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxProfit += prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
    // with recursion
    int maxProfit =0;
    public int maxProfitWithRecursion(int[] prices) {
        return maxProfit(prices,1);
    }
    private int maxProfit(int[] prices,int index){
        if(index==prices.length){
            return maxProfit;
        }
        if(prices[index]>prices[index-1]){
            maxProfit+= prices[index]-prices[index-1];
        }
        return  maxProfit(prices,index+1);
    }
}
