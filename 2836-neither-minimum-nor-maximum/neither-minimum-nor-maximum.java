class Solution {
    public int findNonMinOrMax(int[] nums) {
        //List<Integer> list=new ArrayList();
        Arrays.sort(nums);
        /*for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        if(list.size()<3){
            return -1;
        }
        return list.get(1);*/
        if(nums.length<3){
            return -1;
        }
        return nums[1];
    }
}