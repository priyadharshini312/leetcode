class Solution {
    public String reverseWords(String s) {
        String s1=s.trim().replaceAll("\\s+"," ");
        String arr[]=s1.split(" ");
        String ar[]=new String[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            ar[j]=arr[i];
            j++;
        }
        String m=String.join(" ",ar);
        return m.trim().replaceAll("\\s+"," ");
        /*String m="";
        String l="";
        String s1=s.trim();
        int n=s1.length();
        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)==' ' || i==0){
                l+=m+" ";
                n=i;
            }
            else{
                m=s1.substring(i,n);
            }
        }
        return l;*/
    }
}