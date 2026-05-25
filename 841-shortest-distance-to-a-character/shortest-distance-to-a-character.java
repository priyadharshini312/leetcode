class Solution {
    public int[] shortestToChar(String s, char c) {
       
        int arr[]=new int[s.length()];
        List<Integer> list=new ArrayList();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c){
            list.add(i);
        }
       }
        
        for(int i=0;i<s.length();i++){
             int max=s.length();
            for(int val=0;val<list.size();val++){
                max=Math.min(max,Math.abs(i-list.get(val)));
            }
                 arr[i]=max;
        }
        return arr;
    }
}