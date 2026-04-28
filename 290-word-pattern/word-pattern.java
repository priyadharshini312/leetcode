class Solution {
    public boolean wordPattern(String pattern, String s) {
        List<Integer>list=new ArrayList();
        List<Integer>list1=new ArrayList();
        String m[]=s.split(" ");
        if(pattern.length()!=m.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
                list.add(pattern.indexOf(pattern.charAt(i)));
            }
            for(int i=0;i<m.length;i++){
                        list1.add(Arrays.asList(m).indexOf(m[i]));
            }
            if(list.equals(list1)){
                return true;
                }
                return false;
    }
}