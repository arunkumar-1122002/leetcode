import java.util.List;
import java.util.ArrayList;
public class leetcode22
{
    public static void main(String[] args) {
        Solution ss=new Solution();
        System.out.println(ss.generateParenthesis(3));
    }
}
class Solution {
    List<String> ans=new ArrayList<>();
   public List<String> generateParenthesis(int n)
    {
        helper("",n,n);
        return ans;
    }
   public void helper(String str,int left,int right)
    {
        if(left==0 && right==0)
        {
        ans.add(str);
        return;
        }
        if(left>right)
        return;
        if(left>0)
        helper(str+'(',left-1,right);
        if(right>0)
        helper(str+')',left,right-1);
    }
}
