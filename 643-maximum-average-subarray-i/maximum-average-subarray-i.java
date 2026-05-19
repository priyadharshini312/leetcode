class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0;
        int n=nums.length-k;
        int m=k;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        int tsum=max;
        int sum=0;
         while(k<nums.length){
          sum=max+nums[k]-nums[k-m];
          max=sum;
          tsum=Math.max(sum,tsum);
          k++;
          sum=0;
         }
           
        return (double)tsum/m;
    }
}