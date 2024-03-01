class Solution {
    public String maximumOddBinaryNumber(String s) {
        String answer="";
        boolean firstTime=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(firstTime){
                    firstTime=false;
                    continue;
                }
                answer='1'+answer;
            }else{
                answer=answer+'0';
            }
        }
        return answer+'1';
    }
}
