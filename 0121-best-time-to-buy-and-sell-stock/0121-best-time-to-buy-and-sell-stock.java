class Solution {
    public int maxProfit(int[] arr) {
       int MaxProfit=0;
        int min=arr[0];
        for(int i=0 ; i<arr.length ; i++){
            min=Math.min(min, arr[i]);
            int profit=arr[i]-min;
            MaxProfit=Math.max(MaxProfit, profit);
        }
        return MaxProfit;
    }
}