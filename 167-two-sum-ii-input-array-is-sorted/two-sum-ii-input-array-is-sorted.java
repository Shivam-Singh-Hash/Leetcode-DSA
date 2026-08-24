class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int a = 0;
        int b = n-1;
        while(a<b){
            int sum = numbers[a] + numbers[b];
            if(sum==target){
                return new int[] {a+1,b+1};
            }else if(sum >target){
                b--;
            }else{
                a++;
            }
        }
        return new int[] {};
    }
}