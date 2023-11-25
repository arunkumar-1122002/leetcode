//Palindrome Number-easy
class Solution {
    public boolean isPalindrome(int x) {
        if(x<=-1){
        return false;
        }
        int ans=0,cpy=x;
        while(cpy>0)
        {
        ans=(ans*10)+(cpy%10);
        cpy=cpy/10;
        }
        return ans==x;
    }
}
