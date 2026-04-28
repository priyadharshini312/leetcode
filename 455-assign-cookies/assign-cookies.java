class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int coo=0;
      while(child<g.length && coo<s.length){
            if(g[child]<=s[coo]){
                 child++;
                 
            }
            coo++;
            
        }
    
        return child;
    }
}