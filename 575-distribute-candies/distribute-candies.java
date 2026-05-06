class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:candyType){
            set.add(n);
        }
        int m=candyType.length/2;
        if(set.size()<=m){
            return set.size();
        }
        return m;
    }
}