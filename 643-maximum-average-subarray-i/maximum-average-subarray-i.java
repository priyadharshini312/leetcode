class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int n=nums.length-k;
        for(int i=0;i<=n;i++){
            int sum=0;
            for(int j=i;j<k+i;j++){
                sum+=nums[j];
            }
            //k++;
            max=Math.max(max,sum);
        }
        return (double)max/k;
    }
}