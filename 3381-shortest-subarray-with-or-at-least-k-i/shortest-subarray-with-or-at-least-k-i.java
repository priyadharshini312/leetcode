class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
                for(int i=0;i<nums.length;i++){
            if(nums[i]>=k){
                return 1;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int pro=0;
                for(int l=i;l<=j;l++){
                    pro|=nums[l];
                }
                if(pro>=k){
                   min= Math.min(min,j-i+1);
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}