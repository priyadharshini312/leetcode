class Solution {
    public int[] frequencySort(int[] nums) {
        int j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        while(!map.isEmpty()){
            int min=Integer.MAX_VALUE;
            int val=0;
          for(int key:map.keySet()){

               if(map.get(key)<min){
                 min=map.get(key);
                 val=key;
               }
               else if(map.get(key)==min){
                val=Math.max(val,key);
                min=map.get(key);
    
               }
              
        }
        int i=0;
        while(i<min){
            nums[j++]=val;
            i++;
        }
        map.remove(val);
        }
        return nums;
        
    }
}