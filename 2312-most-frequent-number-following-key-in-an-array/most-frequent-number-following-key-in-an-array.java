class Solution {
    public int mostFrequent(int[] nums, int key) {
        int index=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
             map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
            }
        }
        int val=0;
        int max=Integer.MIN_VALUE;
        for(int k:map.keySet()){
            if(map.get(k)>max){
                max=map.get(k);
                val=k;
            }
           /* else if(map.get(k)==max){
                val=Math.max(val,k);
            }*/
        }
        return val;
        
    }
}