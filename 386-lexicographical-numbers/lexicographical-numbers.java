class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> s=new ArrayList<>();
        for(int i=1;i<n+1;i++){
            s.add(String.valueOf(i));
        }
        Collections.sort(s);
        List<Integer> m=new ArrayList<>();
        for(String num:s){
            m.add(Integer.parseInt(num));
        }
        return m;

    }
}