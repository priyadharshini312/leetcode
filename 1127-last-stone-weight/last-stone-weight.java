class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }
           
        List<Integer> list=new ArrayList();
        for(int i=0;i<stones.length;i++){
            list.add(stones[i]);
        }
        while(list.size()>1){
             Collections.sort(list);
             int result=list.get(list.size()-1)-list.get(list.size()-2);
             list.remove(list.size()-1);
             list.remove(list.size()-1);
             list.add(result);
        }
        return list.get(0);
       
    }
}