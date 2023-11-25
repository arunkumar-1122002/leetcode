//Longest Common Prefix-easy
class Solution {
    public String longestCommonPrefix(String[] strs) {
String ans="";
if(strs.length==0)
return ans;
        for(int i=0;i<strs[0].length();i++)
        {   
            for(int j=0;j<strs.length;j++)
            {  
                if( (strs[j].length()==i) || (strs[j].charAt(i)!=strs[0].charAt(i)))
                return ans;
               
            }
            ans=ans+strs[0].charAt(i);
        }
        return ans;
    }
}
