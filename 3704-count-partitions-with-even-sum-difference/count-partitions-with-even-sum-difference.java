class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        int sum=nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++){
            total+=nums[i];
        }
       for(int i=1;i<nums.length;i++){
            int val=sum-total;
            sum=sum+nums[i];
            total=total-nums[i];
            if(val%2==0){
                count++;
            }
       } 
       return count;
    }
}