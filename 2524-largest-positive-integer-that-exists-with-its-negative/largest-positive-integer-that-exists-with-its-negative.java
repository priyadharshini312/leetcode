class Solution {
    public int findMaxK(int[] nums) {
          Arrays.sort(nums);
          List<Integer> list=new ArrayList();
          for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
          }
          for(int i=0;i<nums.length;i++){
            if(list.contains(-nums[i])){
                return Math.abs(nums[i]);
            }
          }
          return -1;
    }
}