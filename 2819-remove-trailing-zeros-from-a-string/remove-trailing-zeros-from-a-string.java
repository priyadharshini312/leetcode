class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length();
        for(int i=num.length()-1;i>=0;i--){
              if(num.charAt(i)!='0'){
                break;
              }
              else if(num.charAt(i)=='0'){
                  n--;
              }
        }
        return num.substring(0,n);
    }
}