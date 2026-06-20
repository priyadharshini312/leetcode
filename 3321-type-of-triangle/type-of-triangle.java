class Solution {
    public String triangleType(int[] nums) {
        List<Integer> list=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[0]+nums[2]>nums[1]){
        if(list.size()==1){
            return "equilateral";
        }
        int first=nums[0]+nums[1];
        int sec=nums[0]+nums[2];
        int third=nums[1]+nums[2];
        if(first!=sec && sec!=third && first!=third){
            return "scalene";
        }
        else if(first==sec || sec==third || first==third){
            return "isosceles";
        }
        }
        return "none";
    }
}