class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<n;){
            sum+=nums[i];
            i+=2;
        }
        return sum;
    }
}