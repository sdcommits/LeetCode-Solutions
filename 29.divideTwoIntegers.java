class Solution {
    public int divide(int dividend, int divisor) {

        int div = 1;
        if(dividend == -2147483648 && divisor == -1){
            div = 2147483647;
        }else{
            div = dividend/divisor;
        }



        return div;
        
    }
}
