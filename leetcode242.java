class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        return false;
        int[] map=new int[26];
        char[] arr=s.toCharArray();
        for(char ch:arr)
            map[ch-97]++;
        arr=t.toCharArray();
        for(char ch:arr)
            map[ch-97]--;
        for(int count:map)
            if(count>0)
                return false;
        return true;
    }
}
