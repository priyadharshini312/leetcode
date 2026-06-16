class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i=0,j=nums.size()-1;
        int count=0;
        while(i<nums.size()-1){
              if(nums.get(i)+nums.get(j)<target){
                count++;
              } 
              if(j-i==1){
                i++;
                j=nums.size()-1;
              }
              else{  
                j--;
              }
               
        }
        return count;
    }
}