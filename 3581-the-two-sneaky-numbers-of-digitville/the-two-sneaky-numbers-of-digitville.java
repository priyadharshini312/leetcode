class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int arr[]=new int[2];
        int j=0;
        for(int val:map.keySet()){
            if(map.get(val)==2){
                arr[j]=val;
                j++;
            }
        }
        return arr;
    }
}