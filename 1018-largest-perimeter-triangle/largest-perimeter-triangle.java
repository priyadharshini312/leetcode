class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            sum=0;
            if(nums[i]+nums[i+1]>nums[i+2]){
                sum=nums[i]+nums[i+1]+nums[i+2];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}