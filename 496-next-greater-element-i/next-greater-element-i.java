class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            int ins=-1;
               if(map.containsKey(nums1[i])){
                   for(int j=map.get(nums1[i]);j<nums2.length-1;j++){
                      if(nums2[j+1]>nums1[i]){
                          ins=nums2[j+1];
                          break;
                      }
                   }
               }
                 arr[i]=ins;
                }
        return arr;
    }
}