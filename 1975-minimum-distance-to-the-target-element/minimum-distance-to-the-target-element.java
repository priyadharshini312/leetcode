class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int result=Integer.MAX_VALUE;
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                val=Math.abs(i-start);
                result=Math.min(result,val);
                
            }
        }
        return result;
    }
}