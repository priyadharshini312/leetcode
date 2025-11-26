class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterlogs=new ArrayList<>();
        List<String> digitlogs=new ArrayList<>();
        for(String log:logs){
            String[]parts=log.split(" ",2);
            if(Character.isDigit(parts[1].charAt(0))){
                digitlogs.add(log);
            }
            else{
                letterlogs.add(log);
            }
        }
        Collections.sort(letterlogs,(a,b)->{
            String[]p1=a.split(" ",2);
            String[]p2=b.split(" ",2);
            int contentcompare=p1[1].compareTo(p2[1]);
            if(contentcompare==0){
                return p1[0].compareTo(p2[0]);
            }
        
        return contentcompare;
        });
        letterlogs.addAll(digitlogs);
        return letterlogs.toArray(new String[0]);
    }
}