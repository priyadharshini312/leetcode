class Solution {
    public int passwordStrength(String password) {
        int str=0;
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<password.length();i++){
            set.add(password.charAt(i));
        }
    for(char c:set){
        if(String.valueOf(c).matches("[a-z]")){
            str+=1;
        }
        else if(String.valueOf(c).matches("[A-Z]")){
            str+=2;
        }
        else if(String.valueOf(c).matches("[0-9]")){
            str+=3;
        }
        else if(String.valueOf(c).contains("!")||String.valueOf(c).contains("@")||String.valueOf(c).contains("#")
               ||String.valueOf(c).contains("$")){
            str+=5;
    }
    }
    return str;
        
    }
}