class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int right=0;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<fruits.length){
            if(map.size()>=2 && !map.containsKey(fruits[right])){
                int fruit=fruits[left];
                map.put(fruit,map.get(fruit)-1);
                if(map.get(fruit)==0){
                 map.remove(fruit);
                }
                left++;
            }
            else{
                map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
                int sum=0;
                for(int val:map.values()){
                    sum+=val;
                }
                max=Math.max(max,sum);
            
              right++;
            }
        }
        return max;
    }
}