class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int left=0;
        int right=1;
        while(right<nums.length && left<nums.length){
        if(nums[left] % 2==0){
             left++;
             if(left==right){
                right++;
             }
        }
        else if(nums[right] % 2!=0){
             right++;
        }
        else if(nums[right]%2==0){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right++;
        }
        }
        return nums;
    }
}