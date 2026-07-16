class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> list=new ArrayList();
        for(int i=0;i<paths.size();i++){
            list.add(paths.get(i).get(0));
        }
        String s="";
        for(int i=0;i<paths.size();i++){
            if(!list.contains(paths.get(i).get(1))){
                s=paths.get(i).get(1);
            }
        }
        return s;
    }
}