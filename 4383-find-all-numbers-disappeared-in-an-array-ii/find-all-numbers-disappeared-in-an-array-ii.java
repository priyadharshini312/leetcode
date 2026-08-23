class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=lower;i<=upper;i++){
            if(!set.contains(i)){
              list.add(i);
            }
        }
        List<List<Integer> >list11 =new ArrayList();
        int left=0;
        while(left<list.size()){
            int right=left;
             while(right+1<list.size() && list.get(right+1)==list.get(right)+1){
                 right++;
             }
            List<Integer> list12=new ArrayList();
    
            list12.add(list.get(left));
            list12.add(list.get(right));
            list11.add(list12);
            left=right+1;
        }
        return list11;
    }
}