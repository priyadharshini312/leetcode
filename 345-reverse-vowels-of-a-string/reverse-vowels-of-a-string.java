class Solution {
    public String reverseVowels(String s) {
        StringBuilder VOW=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                VOW.append(c);

            }
        }
        StringBuilder ss= new StringBuilder();
        int index=VOW.length()-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='a'&&c!='A'&&c!='e'&&c!='E'&&c!='i'&&c!='I'&&c!='o'&&c!='O'&&c!='u'&&c!='U')
            {
                ss.append(c);
            }
            else{
                    ss.append(VOW.charAt(index));
                    index--;
        }
        }
        return ss.toString();
        }
    }