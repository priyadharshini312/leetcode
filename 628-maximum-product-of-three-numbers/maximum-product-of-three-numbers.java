class Solution {
    public int maximumProduct(int[] nums) {
        int product=1;
        Arrays.sort(nums);
        int first= nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int second=nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(first,second);
    }
}