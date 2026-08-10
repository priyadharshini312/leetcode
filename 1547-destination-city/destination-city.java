class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<paths.size();i++){
               String m=paths.get(i).get(0);
                map.put(m,1);
            }

        for(int i=0;i<paths.size();i++){
               String m=paths.get(i).get(1);
               if(!map.containsKey(m)){
                 return m;
               }
            }
        
        
        return "";
    }
}