/*
recursion approach
leetcode17-medium-letter combination of a phone number*/
class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        return new ArrayList<String>();
        return helper("",digits);
    }
     List<String> helper(String left,String right)
    {
if(right.isEmpty())
{
    List<String> temp=new ArrayList<>();
    temp.add(left);
return temp;
}
int digit=right.charAt(0)-'0';
int st,ed;
List<String> ans=new ArrayList<>();
if(digit==7)
{
    st=(digit-2)*3;
    ed=((digit-1)*3)+1;
}
else if(digit==8)
{
    st=((digit-2)*3)+1;
    ed=((digit-1)*3)+1;
}
else if(digit==9)
{
    st=((digit-2)*3)+1;
    ed=((digit-1)*3)+2;
}
else
{
    st=(digit-2)*3;
    ed=(digit-1)*3;
}
for(int i=st;i<ed;i++)
{
    char ch=(char)(97+i);
    ans.addAll(helper(left+ch,right.substring(1)));
}
return ans;
    }
}
