class Solution {
    public boolean isGood(int[] nums) {
    HashSet<Integer> set= new HashSet<>();
    Arrays.sort(nums);
    int max=nums[nums.length-1];
    if(nums.length<=max){
        return false;
    }
      for(int i=0;i<nums.length;i++){
        if(!set.contains(nums[i])){
            set.add(nums[i]);
        }
        else if(set.contains(nums[i])&& i!=nums.length-1){
            return false;
        }
      }
      return true;
    }
}