class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>list=new ArrayList();
        if(nums.length==0)
        return list;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]-1){
                if(count>0){
                    list.add(nums[i-count]+"->"+nums[i]);
                }
                else{
                    list.add(nums[i]+"");
                }
                count=0;
            }
            else{
               count++;
            }
        }
        if(nums.length>0){
            if(count>0){
                list.add(nums[nums.length-1-count]+"->"+nums[nums.length-1]);
            }
            else{
                list.add(nums[nums.length-1]+"");
            }
        }
        return list;
        
    }
}