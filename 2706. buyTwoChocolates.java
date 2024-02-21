class Solution {
    public int buyChoco(int[] prices, int money) {
        int out = 0;
        int n = prices.length;
        int l = 0, r = prices.length-1;
        Arrays.sort(prices);

        for(int i =0;i<n;i++){
            if(prices[0]+prices[1]<=money){
                out = money - (prices[0]+prices[1]);
                break;
            }
            else{
                out =  money;
            }
        }

        return out;

        
    }
        
}
