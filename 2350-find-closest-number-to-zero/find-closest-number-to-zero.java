class Solution {
    public int findClosestNumber(int[] nums) {
        int val=Integer.MAX_VALUE;
        int min=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],Math.abs(0-nums[i]));
        }
        for(int key:map.keySet()){
            if(map.get(key)<val){
                val=map.get(key);
                min=key;
            }
             else if(map.get(key)==map.get(min)){
                min=Math.max(min,key);
            }
        }
        return min;
    }
}