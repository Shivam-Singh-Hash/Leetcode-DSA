class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int po =0;
        int sum=0;
        for(int i= n-1;i>=0;i--){
            int temp = columnTitle.charAt(i)-64;
            sum += (int)Math.pow(26,po++)*temp;
        }
        return sum;
    }
}