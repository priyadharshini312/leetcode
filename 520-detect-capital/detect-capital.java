class Solution {
    public boolean detectCapitalUse(String word) {
        int l=0,u=0;
        if(Character.isUpperCase(word.charAt(0))){
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    u++;
                }
                else{
                    l++;
                }
            }
        }
        int low=0;
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                low++;
            }
        }
        if(u==0 && l!=0|| low==0 || l==0 && u!=0 || low==word.length()){
            return true;
        }
        return false;
    }
}