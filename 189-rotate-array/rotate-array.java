class Solution {
    public void rotate(int[] nums, int k) {
        int arr[]=new int[nums.length];
        k=k%nums.length;
        int j=0;
        int m=k;
        for(int i=nums.length-k;i<nums.length;i++){
            arr[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length-k;i++){
            arr[m]=nums[i];
            m++;
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
       
    }
}