class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word:strs)
        {
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String shorted=new String(ch);
            if(!map.containsKey(shorted))
                map.put(shorted,new ArrayList<>(){{add(word);}});
            else
                map.get(shorted).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
