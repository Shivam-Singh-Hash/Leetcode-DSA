class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] arr = new int[n];
        int a=(n-1)/2, b=n-1;


        for(int i =0;i<n;i++){
            if(i%2==0){
                arr[i]=nums[a];
                a--;
            }else{
                arr[i]=nums[b];
                b--;
            }
        }
       
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}