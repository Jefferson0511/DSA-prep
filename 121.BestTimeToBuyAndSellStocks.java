class Solution {
    public int maxProfit(int[] prices) {

        // Brute force: for every pair i,j:
        // 1. calculate p[j]-p[i];
        // 2. find max profit and return the profit;


    //     int profit=0;
    //    for(int i=0;i<prices.length;i++){
    //     for(int j=i+1;j<prices.length;j++){
    //         if(prices[j]-prices[i]>profit){
    //             profit= prices[j]-prices[i];
    //         }
    //     }
    //    }
    //    return profit ;

    /*
    Optimal: 1. keep track of min as you loop through
    2. if p[i]<min, update min
    3. p[i] is our selling date and min is our buying date
    4. calculate profit and return max profit
    */

    int min=Integer.MAX_VALUE;
    int profit=0;
    for(int i=0;i<prices.length;i++){
        if(prices[i]<min){
            min=prices[i];
        }
        if(prices[i]-min>profit){
            profit=prices[i]-min;
        }
    }
    return profit;
    }
}