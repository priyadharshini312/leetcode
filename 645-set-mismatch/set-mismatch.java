class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        for(int i=1;i<nums.length+1;i++){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==3){
                arr[0]=entry.getKey();
            }
            else if(entry.getValue()==1){
                arr[1]=entry.getKey();
            }
        }
        return arr;
    }
}
            