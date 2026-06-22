class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        String m=s.substring(0,k);
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)=='a'||m.charAt(i)=='e'||m.charAt(i)=='i'||m.charAt(i)=='o'||m.charAt(i)=='u'){
                count++;
            }
        }
        int max=count;
        int l=k;
        for(int j=1;j<=s.length()-k;j++){
            m=s.substring(j,l+j);
             if(s.charAt(j-1)=='a'||s.charAt(j-1)=='e'||s.charAt(j-1)=='i'||s.charAt(j-1)=='o'||s.charAt(j-1)=='u'){
                count--;
            }

            if(s.charAt(l+j-1)=='a'||s.charAt(l+j-1)=='e'||s.charAt(l+j-1)=='i'||s.charAt(l+j-1)=='o'||s.charAt(l+j-1)=='u'){
                count++;
            }
            max=Math.max(max,count);

        }
        return max;
    }
}
