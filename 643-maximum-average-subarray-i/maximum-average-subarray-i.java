class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int total=0;
        int m=k;
        
        for(int i=0;i<k;i++){
            total+=nums[i];
        }
        double max=(double)total/k;
        
        for(int i=k;i<nums.length;i++){
            int sum=0;
            sum+=total+nums[i]-nums[i-m];
            total=sum;
            max=Math.max(max,(double)total/k);
        }
        return max;
    }
}