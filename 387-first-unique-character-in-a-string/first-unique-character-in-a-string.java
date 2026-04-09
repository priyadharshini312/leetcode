class Solution {
    public int firstUniqChar(String s) {
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int count=0;
           for(int j=0;j<arr.length;j++){
            if(i!=j && arr[i]==arr[j]){
                count++;
                break;
            }
           }
           if(count==0){
            return i;
           }
        }
        
        return -1;
    }
}
          