class Solution {
    public int[] leftRightDifference(int[] nums) {
        int right[]=new int[nums.length];
        int left[]=new int[nums.length];
        int arr[]=new int[nums.length];
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                left[i]=0;
            }
            else{
                left[i]=left[i-1]+nums[i-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                 right[i]=0;
            }
            else{
                right[i]=total-nums[i];
                total=right[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=Math.abs(right[i]-left[i]);
        }
        return arr;

    }
}