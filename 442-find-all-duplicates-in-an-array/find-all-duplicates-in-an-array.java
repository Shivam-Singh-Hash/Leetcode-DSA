class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                res.add(nums[i]);

            }

        }
        return res;
    }
}