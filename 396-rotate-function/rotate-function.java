class Solution {
    public int maxRotateFunction(int[] nums) {
        int value=0;
        int f0=0;
        for(int i=0;i<nums.length;i++){
            value+=nums[i];
            f0+=i*nums[i];
        }
        int prev=f0;
        int max=f0;
        for(int k=1;k<nums.length;k++){
            int curr=prev+value-nums.length*nums[nums.length-k];
            max=Math.max(curr,max);
        prev=curr;
        }
         return max;
    }
}