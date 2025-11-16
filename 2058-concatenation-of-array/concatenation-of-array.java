class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer>list=new ArrayList();
        int[]num=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
        list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
        list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
        list.add(nums[i]);
        }
        for(int i=0;i<num.length;i++){
            num[i]=list.get(i);
        }
        
        return num;
        
    }
}