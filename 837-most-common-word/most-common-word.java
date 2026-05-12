class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set =new HashSet<>();
        HashMap<String,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        String p=paragraph.toLowerCase();
        p=p.replaceAll("\\p{Punct}"," ");
        String arr[]=p.split("\\s+");
        for(int i=0;i<banned.length;i++){
            set.add(banned[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        String fin="";
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                fin=entry.getKey();
            }
        }
        return fin;
    }
}