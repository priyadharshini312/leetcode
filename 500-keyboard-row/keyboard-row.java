class Solution {
    public String[] findWords(String[] words) {
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        List <String> list=new ArrayList();
        String row="";
        for(String m:words){
            String l=m.toLowerCase();
            if(s1.contains(l.charAt(0)+"")){
                row=s1;
            }
            else if(s2.contains(l.charAt(0)+"")){
                row=s2;
            }
            else{
                row=s3;
            }
            boolean valid=true;
            for(char c:l.toCharArray()){
                if(!row.contains(c+"")){
                    valid=false;
                    break;
                }
            }
            if(valid){
                list.add(m);
            }

        }
        return list.toArray(new String[0]);
    }
}
       
