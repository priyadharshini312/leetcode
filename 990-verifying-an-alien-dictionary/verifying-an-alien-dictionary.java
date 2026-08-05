class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<words.length-1;i++){
            int k=0;
                    int min=Math.min(words[i].length(),words[i+1].length());
                    for(k=0;k<min;k++){
                         if(order.indexOf(words[i].charAt(k))>order.indexOf(words[i+1].charAt(k))){
                            return false;
                         }
                         if(order.indexOf(words[i].charAt(k))<order.indexOf(words[i+1].charAt(k))){
                            break;
                         }

                    }
                    if(k==min && words[i].length()>words[i+1].length()){
                        return false;
                    }
                 }
          return true;
    }
}