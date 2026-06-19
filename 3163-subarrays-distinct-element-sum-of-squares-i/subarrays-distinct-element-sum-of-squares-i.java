class Solution {
    public int sumCounts(List<Integer> nums) {
        int val=0;
        for(int i=0;i<nums.size();i++){
          HashSet<Integer> set=new HashSet<>();
        for(int j=i;j<nums.size();j++){
            set.add(nums.get(j));
            int dist=set.size();
            val+=dist*dist;
        }
        }

         /*int prefix[]=new int[nums.size()+1];
         prefix[0]=0;
         int sum=0;
         for(int i=0;i<nums.size();i++){
            prefix[i+1]=prefix[i]+nums.get(i);
         }
         for(int i=0;i<prefix.length;i++){
            sum+=prefix[i];
         }
         return sum;*/
         return val;
         
    }
}