class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1;
        int n=nums.length-1;
        int arr[]=new int[n+1];
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                arr[n--]=nums[i]*nums[i];
                i++;
            }
            else if(Math.abs(nums[j])>Math.abs(nums[i])){
                arr[n--]=nums[j]*nums[j];
                j--;
            }
            else{
                if(i==j){
                    arr[n--]=nums[i]*nums[i];
                    i++;
                }
                else{
                arr[n--]=nums[i]*nums[i];
                arr[n--]=nums[j]*nums[j];
                i++;
                j--;
                }
            }
        }
        return arr;
    }
}