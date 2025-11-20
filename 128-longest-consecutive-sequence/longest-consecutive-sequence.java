class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int currentelem=n;
                int length=1;
                while(set.contains(currentelem+1)){
                    currentelem++;
                    length++;
                }
            
            longest=Math.max(longest,length);
            }
        }
        return longest;

    }
}