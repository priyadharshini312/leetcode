class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int t=0;
        
        
        while(t<k){
            int min=Integer.MAX_VALUE;
           
            for(int i=0;i<nums.length;i++){
                
                min=Math.min(min,nums[i]);
            }
            for(int j=0;j<nums.length;j++){
                if(min==nums[j]){
                    nums[j]=nums[j]*multiplier;
                    break;
                }
            }
            t++;
            
        }
        return nums;
    }
}