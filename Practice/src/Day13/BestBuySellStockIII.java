package Day13;

import java.util.Arrays;

public class BestBuySellStockIII {
    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //
    //Find the maximum profit you can achieve. You may complete at most two transactions.
    //
    //Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
    public int maxProfit(int[] prices) {
        int[][][] memo = new int[prices.length][2][3];
        Arrays.stream(memo).forEach(a->Arrays.stream(a).forEach(b->Arrays.fill(b,-1)));
        return maxProfit(memo,prices,0,false,2);
    }
    private int maxProfit(int[][][] memo,int[] prices,int currentDay,boolean isBought,int transactionLeft){
        int maxProfit = 0;
        if(currentDay==prices.length ){
            return maxProfit;
        }
        if(!isBought && transactionLeft==0){
            return maxProfit;
        }
        if(memo[currentDay][isBought ==true ? 1 : 0][transactionLeft] != -1){
            return memo[currentDay][isBought ==true? 1: 0][transactionLeft];
        }

        //Take no action
        maxProfit = maxProfit(memo,prices,currentDay+1, isBought,transactionLeft);
        //Sell the stock if stock is Bought else buy stocks
        if(isBought){
            maxProfit = Math.max(maxProfit,prices[currentDay]+maxProfit(memo,prices,currentDay+1, !isBought,transactionLeft));
        } else{
            maxProfit = Math.max(maxProfit,maxProfit(memo,prices,currentDay+1, !isBought,transactionLeft-1)-prices[currentDay]);
        }
        memo[currentDay][isBought ? 1 : 0][transactionLeft]=maxProfit;
        return maxProfit;
    }
}
