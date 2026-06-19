class Solution {
    public String maximumOddBinaryNumber(String s) {
      /*int n=String.valueOf(s);
      if((n & 1)!=0){
        for(int i=n+2;i<n*n;i++){
            if((i & 1)!=0 && Integer.parseInt(i).contains(s)){
                max=Math.max(max,i);
            }
        }
      }*/
      int one=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            one++;
        }
      }
      StringBuilder sb= new StringBuilder();
      for(int i=1;i<one;i++){
            sb.append('1');
        
      }
      for(int i=0;i<s.length()-one;i++){
                sb.append('0');
      }
      sb.append('1');
      return sb.toString();
    }
}
     