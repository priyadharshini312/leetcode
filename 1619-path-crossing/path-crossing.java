class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set=new HashSet<>();
        int row=0;
        int col=0;
        set.add("0,0");
        for(int i=0;i<path.length();i++){
            char ch=path.charAt(i);
            if(ch=='N'){
                row++;
            }
            if(ch=='S'){
                row--;
            }
            if(ch=='W'){
                col--;
            }
            if(ch=='E'){
                col++;
            }
            if(set.contains(row+","+col)){
                return true;
            }
            else{
                set.add(row+","+col);
            }
    
            
        }
        return false;
    }
}